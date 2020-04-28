package app

import model.FindResult
import org.scalatest.matchers._
import org.scalatest.wordspec.AnyWordSpec

class FindWordsSpec extends AnyWordSpec with must.Matchers {

  "Finding the longest word" should {

    val findWords = new FindWords

    "return None when no words were found because the string was empty" in {

      findWords.findLongest("") mustBe None
    }

    "return None when no words were found because the string contained no alpha chars" in {

      findWords.findLongest(" ,.") mustBe None
    }

    "return the longest word found in a sentence" in {

      findWords.findLongest("The cow jumped over the moon.") mustBe Some(FindResult("jumped", 6))
    }

    "return the first longest word found in a sentence" in {

      findWords.findLongest("try this for a test") mustBe Some(FindResult("this", 4))
    }

    "punctuation should delimit words" in {

      findWords.findLongest("try,this.for-a@test") mustBe Some(FindResult("this", 4))
    }
  }
}
