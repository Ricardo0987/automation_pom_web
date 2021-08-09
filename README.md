# 1. Technical - Automated Test.

---

## Description and context 📖

This repository contains web test. Using POM (Page Object Model) design pattern.


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

## Challenge_1 🏃🏻‍

One of the most important companies in the software development sector wants to hire you for testing and automating the
PURCHASE process on https://www.saucedemo.com/ website. As a QA Engineer, you must create a test suite using the full
potential of the language you feel most comfortable with. Your goal is to ensure the quality of the process applying
Deep tests methodology (where you should create the test cases to validate the positives and negatives aspects in the
process), reports (you’d need to generate a report on any format with the results logged). found bugs (if there are no
bugs found, we’ll appreciate to see an invented bug reported), it is also important to meet the following requirements:

    1. To have a Test plan and a set of test cases
    2. The Page Object Model should be implemented
    3. The repository should be versioned using Github or any other public
       repository.
    4. Code Documentation.

### Points to validate in automated tests:

- Login
- Logout
- Sort products by name
- Sort products by price
- Add products to the cart
- Remove products from the cart
- Complete checkout
- Thank you page

> NOTE: You can use any framework or language to complete the task https://nightwatchjs.org/, https://webdriver.io/, https://jestjs.io/, etc. Also you can use any assertion library like https://www.chaijs.com/.

# 2. Bonus: Algorithm Problem.

---

## Execution 🚀

> just open `./algorithm/index.html`

> the function is inside `index.js`

## Challenge_2 🏃🏻‍

> Write a function that reverses characters in (possibly nested) parentheses in the input string. Input strings will always be well-formed with matching ()s. Example:

- For inputString = "(bar)", the output should be reverseInParentheses(inputString) = "rab";
- For inputString = "foo(bar)baz", the output should be reverseInParentheses(inputString) = "foorabbaz";
- For inputString = "foo(bar)baz(blim)", the output should be reverseInParentheses(inputString) = "foorabbazmilb";
- For inputString = "foo(bar(baz))blim", the output should be reverseInParentheses(inputString) = "foobazrabblim".
  Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".

### Input/Output

> [input] string inputString

- A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in
  inputString create a regular bracket sequence.
- Guaranteed constraints: 0 ≤ inputString.length ≤ 50.

> [output] string

- Return inputString, with all the characters that were in parentheses reversed.

***NOTE: The algorithm problem (second part) is not a priority, please complete the first part, and solve the algorithm
problem if you have time to spare.***


## 🚀🚀🚀 Run all with docker 🚀🚀🚀

install `docker` and `docker-compose`

run `docker-compose up`

then open `http://localhost:8000/` for `2. Bonus: Algorithm Problem.`

when finish gradle container open `./target/site/serenity/index.html` for `1. Technical - Automated Test.`