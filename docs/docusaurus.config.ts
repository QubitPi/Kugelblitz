/**
 * Copyright 2025 Jiaqi Liu. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import {themes as prismThemes} from 'prism-react-renderer';
import type {Config} from '@docusaurus/types';
import type * as Preset from '@docusaurus/preset-classic';

const config: Config = {
  title: 'Kugelblitz',
  tagline: 'Webservice with First-Class Support for Graph Database as both GraphRAG and Relational Datastore',
  favicon: 'img/favicon.ico',

  url: 'https://kugelblitz.qubitpi.org',
  baseUrl: '/',

  organizationName: 'QubitPi',
  projectName: 'Kugelblitz',

  onBrokenLinks: 'throw',
  onBrokenMarkdownLinks: 'throw',

  i18n: {
      defaultLocale: 'en',
      locales: ['en', 'de'],
  },

  presets: [
    [
      'classic',
      {
        docs: {
          sidebarPath: './sidebars.ts',
          editUrl:
              'https://github.com/QubitPi/Kugelblitz/tree/master/docs',
        },
        theme: {
          customCss: './src/css/custom.css',
        },
      } satisfies Preset.Options,
    ],
  ],

  themeConfig: {
    image: 'img/logo.png',
    navbar: {
      title: 'Kugelblitz',
      logo: {
        alt: 'Kugelblitz Logo',
        src: 'img/logo.svg',
      },
      items: [
        {
            type: 'localeDropdown',
            position: 'left',
        },
        {
          type: 'docSidebar',
          sidebarId: 'tutorialSidebar',
          position: 'left',
          label: 'Documentation',
        },
        {
          href: "https://kugelblitz.qubitpi.org/apidocs",
          label: "API",
          position: "left",
        },
        {
          href: 'https://github.com/QubitPi/Kugelblitz',
          label: ' ',
          position: 'right',
          className: 'header-icon-link header-github-link',
        },
      ],
    },
    footer: {
      style: 'dark',
      links: [
        {
          title: 'Docs',
          items: [
            {
              label: 'Documentation',
              to: '/docs/intro',
            },
            {
              label: 'ArangoDB',
              href: 'https://arango.qubitpi.org/stable/',
            },
          ],
        },
        {
          title: 'More',
          items: [
            {
              label: 'GitHub',
              href: 'https://github.com/QubitPi/Kugelblitz',
            },
            {
                label: 'Jiaqi Liu',
                href: 'https://github.com/QubitPi',
            },
            {
                label: "Jiaqi's Blog",
                href: 'https://leadership.qubitpi.org/',
            },
          ],
        },
      ],
      copyright: `Copyright © ${new Date().getFullYear()} Jiaqi Liu. Built with Docusaurus.`,
    },
    prism: {
      theme: prismThemes.github,
      darkTheme: prismThemes.dracula,
      additionalLanguages: ["java", "bash", "json"]
    },
  } satisfies Preset.ThemeConfig,
};

export default config;
