# 1. Automated Test.

---

## Description and context 📖

This repository contains web test. Using POM (Page Object Model) design pattern.

> Documentation path: `./Design and Execution`
> - saucedemo TestPlan.pdf
> - saucedemo TestCases.xlsx
> - example report.zip
> - example report with fails.zip

## Execution 🚀
---
in console:

```bash
gradle clean test aggregate
```
path of the generated report: `target/site/serenity`

in `Runner` you can select the different Tags to run separate test cases or the entire test set:

`@ AllCases`

`@ AuthCases ...`

`@ TestCase_1, @ TestCase_2 ...`

### Tools and technologies used 🛠
---

- Gradle
- Java (11)
- Cucumber
- Selenium
- Gherkin
- Serenity
- IDE IntelliJ
- SonarLint (plugin-IntelliJ)

-----------------------------


# 2. Algorithm Problem.

---

## Execution 🚀

> just open `./algorithm/index.html`

> the function is inside `index.js`


## 🚀🚀🚀 Run all with docker 🚀🚀🚀

install `docker` and `docker-compose`

run `docker-compose up`

then open `http://localhost:8000/` for `2. Algorithm Problem.`

when finish gradle container open `./target/site/serenity/index.html` for `1. Automated Test.`