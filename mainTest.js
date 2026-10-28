

const { shortestWordFromSentence, squareArrayAscending } = require('./main');

describe('String and Array Utility Tests', () => {
    
    test('should find the shortest word in a sentence', () => {
        const sentence = "Shola is a student at Semicolon Africa ";
        const result = shortestWordFromSentence(sentence);
        expect(result).toBe("is");
    });

    test('should square array elements and sort them in ascending order', () => {
        const input = [-4, -1, 0, 3, 10];
        const result = squareArrayAscending(input);
        expect(result).toEqual([0, 1, 9, 16, 100]);
    });

});
