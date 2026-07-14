class HighScores {
  final List<int> scores;

  HighScores(this.scores);

  int latest() {
    return scores.last;
  }

  int personalBest() {
    int a;
    for (int i = 0; i < scores.length; i++) {
      for (var j = i + 1; j < scores.length; j++) {
        if (scores[i] > scores[j]) {
          a = scores[i];
          scores[i] = scores[j];
          scores[j] = a;
        }
      }
    }

    return scores.last;
  }

  List<int> personalTopThree() {
    int a;
    for (int i = 0; i < scores.length; i++) {
      for (var j = i + 1; j < scores.length; j++) {
        if (scores[i] > scores[j]) {
          a = scores[i];
          scores[i] = scores[j];
          scores[j] = a;
        }
      }
    }

    return scores.skip(scores.length - 3).toList();
  }
}
