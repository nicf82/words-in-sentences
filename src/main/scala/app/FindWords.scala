package app

import model.FindResult

class FindWords {

  type FindByPredicate = (Option[FindResult], String) => Boolean

  def findWordBy(predicate: FindByPredicate)(sentence: String): Option[FindResult] = {

    sentence.split("[^a-zA-Z]+").filterNot(_.isEmpty).foldLeft[Option[FindResult]](None) {

      case (candidate, current) =>

        if(predicate(candidate, current)) Some(FindResult(current, current.size))
        else candidate
    }
  }

  val findLongest: String => Option[FindResult]  = findWordBy((candidate, current) => candidate.fold(true)(c => current.size > c.len) )
  val findShortest: String => Option[FindResult] = findWordBy((candidate, current) => candidate.fold(true)(c => current.size < c.len) )
}