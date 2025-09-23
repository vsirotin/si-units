# Development Guide

## Three-Phase Version Strategy

This project follows a strategic three-phase approach to version management that balances development efficiency, library compatibility, and future-proofing:

### Phase 1: Generation
- **Purpose**: Code generation tools for maximum developer productivity
- **Java/Kotlin**: Latest stable versions
- **Modules**: `kotunil-generators`
- **Rationale**: Internal tools benefit from newest language features

### Phase 2: Library Build  
- **Purpose**: Distributed library for maximum client compatibility
- **Java**: Java 11 toolchain targeting Java 8 bytecode
- **Kotlin**: Latest stable version
- **JavaScript**: ES2016 target, Node.js 14+ compatibility
- **Modules**: `kotunil`, `js-lib`
- **Rationale**: Broad compatibility with enterprise and legacy systems

### Phase 3: Testing
- **Purpose**: Future compatibility validation and early issue detection
- **Java/Kotlin**: Latest stable versions
- **JavaScript/Node.js**: Latest LTS versions
- **Modules**: All `apps/*` test applications
- **Rationale**: Ensure forward compatibility and catch breaking changes early

## Development Process

This document describes the process of development, deploying and releasing a new version of the project.

From experience, the process of development, deployment and releasing a new version 
of the project can be made better manually.  

The table below lists the steps to be taken, corresponding terminal commands 
and quality criteria for completion of each step and moving to the next one.

| Step                                                     | Command                                                                                                                                                                          | Quality Criteria                                                                                                                                                                                                                                                                                                                                                                                                                            |
|----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Manual preprocessing                                     | In root's build.gradle.kts update val version for new version number and set kotunilJvmStableVersion for stable (old) version number. Update kotunilJsVersion                                    | Check, that Sync Gradle process correctly.                                                                                                                                                                                                                                                                                                                                                                                                  |
| Cleanup                                                  | ./gradlew clean                                                                                                                                                                  | No build directories in main project directory and sub-project directories.                                                                                                                                                                                                                                                                                                                                                                 |
| Sources generation                                       | ./gradlew :kotunil-generators:run                                                                                                                                                | Generation without errors.                                                                                                                                                                                                                                                                                                                                                                                                                  |    
| Library build                                            | ./gradlew :kotunil:build                                                                                                                                                         | Build without errors.                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                                                                               |
| Test all artifacts                                       | ./gradlew :kotunil:testAllArtifacts                                                                                                                                              | All tests pass without errors.                                                                                                                                                                                                                                                                                                                                                                                                              |
| Publishing in mavenLocal                                 | ./gradlew :kotunil:publishToMavenLocal                                                                                                                                           | No errors. All expected libraries with corresponding creation time can be found in directory /Users/USER/.m2/repository/eu/sirotin/kotunil/kotunil-jvm/VERSION                                                                                                                                                                                                                                                                              |
| Switch JVM apps to mavenLocal version of library         | ./gradlew :switchJvmTestAppsToMavenLocal                                                                                                                                         | 1) Check apps/java-console/build.gradle.kts that it uses mavenLocal as repository. 2) Check apps/kotlin-console/build.gradle.kts that it uses mavenLocal as repository.                                                                                                                                                                                                                                                                     |
| Build and test java app with local version of library    | 1) Set in si-units/build.gradle.kts val kotunilJvmStableVersion = kotunilVersion. 2) Update gradle. 3) ./gradlew :apps:jvm:java-console:run                                      | Check table in output. Compare expectations and test results.                                                                                                                                                                                                                                                                                                                                                                               |
| Build and test kotlin app with local version of library  | 1) ./gradlew :apps:jvm:kotlin-console:run                                                                                                                                        | Check table in output. Compare expectations and test results.                                                                                                                                                                                                                                                                                                                                                                               |
| Publishing JS part locally                               | 1) ./gradlew :js-lib:clean 2) ./gradlew :js-lib:build                                                                                                                            | File js-lib/dist/package.json contains lines "version" and "kotunil-version" with new values                                                                                                                                                                                                                                                                                                                                                |
| Test node_ts app with local version of library           | 1) ./gradlew :apps:node_ts_app:switchNodeTestToLocalJsLibrary 2)./gradlew :apps:node_ts_app:clean 3)./gradlew :apps:node_ts_app:build 4)./gradlew :apps:node_ts_app:startConsole | 1) Check that file apps/node_ts_app/node_modules/kotunil-js-lib/package.json uses right version. 2) Check output in terminal. Compare expectation and test results in the table console output.                                                                                                                                                                                                                                             |
| Test web_app_js app with local version of library        | 1)./gradlew :apps:web_app_js:clean 2)./gradlew :apps:web_app_js:build 3) In IDE select index.html and start it (e.g. with popup-menu command "Open in..."                        | 1) Check that file apps/web_app_js/lib/package.json uses local version ("kotunil-js-lib": "file:../../js-lib/dist"). 2) Start apps/web_app_js/index.html and check output in browser. Should be 3 lines: L1)Number tests (checks):1078  L2)Number KotUniL's tested objects: 61 L3)Number errors:0                                                                                                                                           |
| Publishing in mavenCentral                               | 1)./gradlew :kotunil:publish 2) Continue process manually                                                                                                                        | 1) Check availability of new version on https://central.sonatype.com/search?q=eu.sirotin.kotunil                                                                                                                                                                                                                                                                                                                                            |
| Switch JVM apps to mavenCentral version of library       | ./gradlew :switchJvmTestAppsToMavenCentral                                                                                                                                       | 1) Check apps/java-console/build.gradle.kts that it uses mavenCentral as repository. 2) Check apps/kotlin-console/build.gradle.kts that it uses mavenCentral as repository.                                                                                                                                                                                                                                                                 |
| Build and test java app with global version of library   | 1) ./gradlew :apps:jvm:java-console:run                                                                                                                                          | Check table in output. Compare expectations and test results.                                                                                                                                                                                                                                                                                                                                                                               |
| Build and test kotlin app with global version of library | 1) ./gradlew :apps:jvm:kotlin-console:run                                                                                                                                        | Check table in output. Compare expectations and test results.                                                                                                                                                                                                                                                                                                                                                                               |
| Publishing JS part in (global) NPM                       | 1)./gradlew :js-lib:publishToGlobalNPM                                                                                                                                           | Check availability of new version on https://www.npmjs.com/package/kotunil-js-lib                                                                                                                                                                                                                                                                                                                                                           |
| Test node_ts app with global version of library          | 1) ./gradlew :apps:node_ts_app:switchToNPMCentral 2)./gradlew :apps:node_ts_app:clean 3)./gradlew :apps:node_ts_app:build 4)./gradlew :apps:node_ts_app:startConsole             | 1) Check that file apps/node_ts_app/node_modules/kotunil-js-lib/package.json uses right version. Should be equal to kotunilJsVersion from root build.gradle.kts 2) Check output in terminal. Compare expectation and real values in table in console output.                                                                                                                                                                                |
| Publishing documentation                                 | 1) ./gradlew buildAndDeployDocs 2) ./gradlew deployToGitHubPages                                                                                                                 | 1) Check that docs/<version>/ directory is created with documentation. 2) Check docs/index.html shows version list. 3) Documentation available at https://vsirotin.github.io/si-units/ <br/>**Additional commands:** <br/>• Local build: `./build-docs.sh` <br/>• Remove old version: `./gradlew removeVersionDocs -Pversion=X.Y.Z` <br/>• Build only docs: `./gradlew buildVersionedDocs` <br/>• Update index: `./gradlew createDocsIndex` |
| Publishing in GitHub releases                            | 1) Commit with #Release <version-number> 2) Process releasing in GitHub Web UI                                                                                                   |                                                                                                                                                                                                                                                                                                                                                                                                                                             |

## Contributing Guidelines

### Working by Forking

Just head over to the GitHub page and click the "Fork" button. It's that simple. Once you've done that, you can use your favorite git client to clone your repo or just head straight to the command line:

#### Clone your fork to your local machine
```bash
git clone git@github.com:USERNAME/FORKED-PROJECT.git
```

#### Keeping Your Fork Up to Date
While this isn't an absolutely necessary step, if you plan on doing anything more than just a tiny quick fix, you'll want to make sure you keep your fork up to date by tracking the original "upstream" repo that you forked. To do this, you'll need to add a remote:

```bash
# Add 'upstream' repo to list of remotes
git remote add upstream https://github.com/vsirotin/si-units.git

# Verify the new remote named 'upstream'
git remote -v
```

Whenever you want to update your fork with the latest upstream changes, you'll need to first fetch the upstream repo's branches and latest commits to bring them into your repository:

```bash
# Fetch from upstream remote
git fetch upstream

# View all branches, including those from upstream
git branch -va
```

Now, checkout your own master branch and merge the upstream repo's master branch:

```bash
# Checkout your master branch and merge upstream
git checkout master
git merge upstream/master
```

If there are no unique commits on the local master branch, git will simply perform a fast-forward. However, if you have been making changes on master (in the vast majority of cases you probably shouldn't be - see the next section), you may have to deal with conflicts. When doing so, be careful to respect the changes made upstream.

Now, your local master branch is up-to-date with everything modified upstream.

#### Create a Branch (doing your work)
Whenever you begin work on a new feature or bugfix, it's important that you create a new branch. Not only is it proper git workflow, but it also keeps your changes organized and separated from the master branch so that you can easily submit and manage multiple pull requests for every task you complete.

To create a new branch and start working on it, perform the following flow:

```bash
# Checkout the master branch - you want your new branch to come from master
git checkout master

# Create a new branch and switch to it
git checkout -b feature/your-feature-name

# Make your changes and commit them
git add .
git commit -m "Description of your changes"

# Push your branch to your fork
git push origin feature/your-feature-name
```

### Code Standards

- Follow Kotlin coding conventions
- Write meaningful commit messages
- Include tests for new features
- Update documentation when adding new functionality
- Use descriptive variable names, especially for physical quantities

### Testing Requirements

Before submitting a pull request:

1. **Run all tests**: `./gradlew test`
2. **Test all platforms**: Ensure JVM, JS, and iOS targets compile and work correctly
3. **Verify examples**: Run the example applications in `apps/` directory
4. **Check compatibility**: Test with both latest and minimum supported Java/Node.js versions

### Pull Request Process

1. Ensure any install or build dependencies are removed before the end of the layer when doing a build
2. Update the README.md with details of changes to the interface, this includes new environment variables, exposed ports, useful file locations and container parameters
3. Increase the version numbers in any examples files and the README.md to the new version that this Pull Request would represent
4. You may merge the Pull Request once you have the sign-off of two other developers, or if you do not have permission to do that, you may request the second reviewer to merge it for you

### Issue Reporting

When reporting issues:

- Use a clear and descriptive title
- Describe the exact steps to reproduce the problem
- Include the expected behavior and what actually happened
- Specify your environment (Java version, Node.js version, operating system)
- Include relevant code snippets or examples

### Feature Requests

When suggesting new features:

- Explain the use case and why it would be valuable
- Provide examples of how the feature would be used
- Consider backward compatibility implications
- Be open to alternative implementations
