/**
 * Copyright 2025 Jiaqi Liu. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import clsx from 'clsx';
import Heading from '@theme/Heading';
import styles from './styles.module.css';
import Translate from '@docusaurus/Translate';
import Link from '@docusaurus/Link';

type FeatureItem = {
  title: string;
  Svg: React.ComponentType<React.ComponentProps<'svg'>>;
  description: JSX.Element;
};

const FeatureList: FeatureItem[] = [
  {
    title: 'Open API',
    Svg: require('@site/static/img/openapi-logo.svg').default,
    description: (
        <>
          <Translate
            id="homepage.feature.swagger"
            values={{
              swagger: (
                  <Link to="https://swagger.io/">
                    <Translate id="homepage.feature.swagger.link">
                      Swagger
                    </Translate>
                  </Link>
              ),
            }}>
            {'The API documentation is powered by {swagger}, providing comprehensive and interactive API documentation.'}
          </Translate>
        </>
    ),
  },
  {
    title: 'Graph Data',
    Svg: require('@site/static/img/graph.svg').default,
    description: (
        <>
          <Translate
            id="homepage.feature.arango"
            values={{
              arango: (
                  <Link to="https://arango.qubitpi.org/stable/">
                    <Translate id="homepage.feature.arango.link">
                      ArangoDB
                    </Translate>
                  </Link>
              ),
            }}>
            {'Designed for Knowledge Graph and connection inference, Kugelblitz has first-class support for {arango} as a back-end and flexible pipeline-style architecture which handles nearly any graph database for data storage'}
          </Translate>
        </>
    ),
  },

  {
    title: 'Open Source',
    Svg: require('@site/static/img/apache.svg').default,
    description: (
        <>
          <Translate
            id="homepage.feature.opensource"
            values={{
              github: (
                  <Link to="https://github.com/QubitPi/Kugelblitz">
                    <Translate id="homepage.feature.opensource.github">
                      Github
                    </Translate>
                  </Link>
              ),
              apache: (
                  <Link to="http://www.apache.org/licenses/LICENSE-2.0.html">
                    <Translate id="homepage.feature.opensource.apache">
                      Apache License, Version 2.0
                    </Translate>
                  </Link>
              ),
            }}>
            {'Kugelblitz is 100% open source and available on {github}. Released under the commercial-friendly {apache}.'}
          </Translate>
        </>
    ),
  },
];

function Feature({title, Svg, description}: FeatureItem) {
  return (
      <div className={clsx('col col--4')} style={{color: "white"}}>
        <div className="text--center">
          <Svg className={styles.featureSvg} role="img"/>
        </div>
        <div className="text--center padding-horiz--md">
          <Heading as="h3">{title}</Heading>
          <p>{description}</p>
        </div>
      </div>
  );
}

export default function HomepageFeatures(): JSX.Element {
  return (
      <section className={styles.features}>
        <div className="container">
          <div className="row">
            {FeatureList.map((props, idx) => (
                <Feature key={idx} {...props} />
            ))}
          </div>
        </div>
      </section>
  );
}
