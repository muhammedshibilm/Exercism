int scores = 0;
var i = 0;
var names = 0;
String letter = '';

int score(String letters) {
  names = letters.length;
  letter = letters.toLowerCase();
  for (i; i < names; i++) {
    // A, E, I, O, U, L, N, R, S, T
    if ((letter[i] == 'a') ||
        (letter[i] == 'e') ||
        (letter[i] == 'i') ||
        (letter[i] == 'o') ||
        (letter[i] == 'u') ||
        (letter[i] == 'l') ||
        (letter[i] == 'n') ||
        (letter[i] == 'r') ||
        (letter[i] == 's') ||
        (letter[i] == 't')) {
      scores = scores + 1;
    } else if ((letter[i] == 'd') || (letter[i] == 'g')) {
      //D, G
      scores = scores + 2;
    } else if ((letter[i] == 'b') ||
        (letter[i] == 'c') ||
        (letter[i] == 'm') ||
        (letter[i] == 'p')) {
      //B, C, M, P
      scores = scores + 3;
    } else if ((letter[i] == 'f') ||
        (letter[i] == 'h') ||
        (letter[i] == 'v') ||
        (letter[i] == 'w') ||
        (letter[i] == 'y')) {
      //F, H, V, W, Y
      scores = scores + 4;
    } else if ((letter[i] == 'k')) {
      //K
      scores = scores + 5;
    } else if ((letter[i] == 'j') || (letter[i] == 'x')) {
      //J, X
      scores = scores + 8;
    } else if ((letter[i] == 'q') || (letter[i] == 'z')) {
      //Q, Z
      scores = scores + 10;
    } else {
      scores = scores + 0;
    }
  }
  return scores;
}
