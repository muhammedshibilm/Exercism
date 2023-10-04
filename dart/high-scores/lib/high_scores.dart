class HighScores {
 fina List<int> scores;

  HighScores(this.scores);

  

  int latest() {
    return scores.last;
  }

  int personalBest() {
    return scores.first;
  }

  List<int> personalTopThree() {
    return sorted.take(3).toList();
  }
}
