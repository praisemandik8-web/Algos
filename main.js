function main() {
    const shortestWord = shortestWordFromSentence("Shola is a student at Semicolon Africa ");
    const shortestWord2 = shortestWordFromSentence("Peter Parker picked three pecks of pickled peppers");
    console.log("Shortest word: " + shortestWord);
    console.log("Shortest word 2: " + shortestWord2);

    let squaredArray = [-4, -1, 0, 3, 10];
    squaredArray = squareArrayAscending(squaredArray);
    console.log("Squared array in ascending order: [" + squaredArray.join(", ") + "]");
}

function shortestWordFromSentence(sentence) {
    
    const words = sentence.split(" ").filter(Boolean);
    if (words.length === 0) return "";
    
    let shortestWord = words[0];

    for (let i = 0; i < words.length; i++) {
        if (words[i].length < shortestWord.length) {
            shortestWord = words[i];
        }
    }

    return shortestWord;
}

function squareArrayAscending(arr) {
    const squaredArr = [];
    
    for (let i = 0; i < arr.length; i++) {
        squaredArr.push(arr[i] * arr[i]);
    }

    squaredArr.sort((a, b) => a - b);

    return squaredArr;
}


main();
