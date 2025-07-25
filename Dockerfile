# Copyright 2025 Jiaqi Liu. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
FROM maven:3.8.3-openjdk-17 as build

RUN mkdir /kugelblitz
COPY . /kugelblitz
RUN cd /kugelblitz && mvn clean package -Dmaven.test.skip=true

FROM openjdk:17-jdk-alpine

LABEL maintainer="Jiaqi (Jack) Liu"
LABEL maintainer-email="jack20220723@gmail.com"

RUN apk add curl

COPY --from=build /kugelblitz/target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
