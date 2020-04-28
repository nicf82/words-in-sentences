Words in sentences
==================

Short scala program to demonstrate a method to find the longest and shortest words in sentences.

Assumptions
-----------

This is a naive implementation because we assume that a word is a continuous grouping of alpha chars 
delimited by one or more non-alpha chars.

A suggested improvement would be to use more advanced pattern matching to allow for things like 
possessive apostrophe and hyphens within words. Or use a purpose built text processing library like
`nltk` for Python.

Build and test
--------------

The program can be build and tested using `sbt` by running

    sbt test
    
> See https://www.scala-sbt.org/1.x/docs/Setup.html for instructions on how to install `sbt`