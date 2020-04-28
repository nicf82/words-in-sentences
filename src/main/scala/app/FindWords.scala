package app

import model.FindResult

class FindWords {

  def findLongest(sentence: String): Option[FindResult] = {

    sentence.split("[^a-zA-Z]+").foldLeft[Option[FindResult]](None) {

      case (result, word) =>
        if(word.size > result.fold(0)(_.len)) Some(FindResult(word, word.size))
        else result
    }
  }
}