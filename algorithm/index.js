const reverseInParentheses = (inputString) => {
  if (inputString.length < 0 || inputString.length > 50)
    return "the length should be: 0 ≤ inputString.length ≤ 50";
  if (!inputString.match(/^[a-z,(,),\s]{0,}$/))
    return "A string should be: lowercase letters and the characters ( and )";

  const regexp = /\([a-z,\s]{0,}\)/gi;
  let hasParentheses = inputString.match(regexp);

  while (hasParentheses) {
    inputString = inputString.replace(regexp, (word) => {
      const invertedWord = word
        .split("")
        .reverse()
        .join("")
        .replace(/[(,)]/g, "");

      return invertedWord;
    }).replace(/\s+/g, "");

    hasParentheses = inputString.match(regexp);
  }
  return inputString;
};