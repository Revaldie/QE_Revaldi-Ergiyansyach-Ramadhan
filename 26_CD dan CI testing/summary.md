# (26) Testing in CI/CD Pipeline

## Resume
1. Introduction CI/CD
2. CI/CD Proccess
3. Github Actions

### Introduction CI/CD
CI(Continous Integration) is the practice of integrating code into a shared repository and building/testing each change automatically, as early as possible - usually several times a day

CD(Continous Delivery) adds that the software can be released to production at any time, often by automatically pushing changes to staging system

Continous Deployment goes further and pushes changes to production automatically

Difference
CI : automatically prepare and track a release to production.
CD : every change in the source code is deployed to production automatically, without explicit approval from a developer

advantage using CI :
- Decoupled Stages
- Repeatable
- Fail Fast

advantage using CD :
- design with system in minde
- pipelines
- globally unique versions

### CI/CD Process
1. commit
2. build
3. test
4. deploy

### Github Actions

**Components**
- workflow
	configurable automated process that will run one or more jobs
- jobs
	a set of steps in a workflow that execute on the same runner
- actions
	a custom application for the GitHub Actions platform that performs a complex but frequently repeated task.
- events
	a specific activity in a repository that triggers a workflow run
- runners
	a server that runs your workflows when they're triggered
