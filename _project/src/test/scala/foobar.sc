val str = "asdf, asasdf, fdafaw"

Option(str).fold[Seq[String]](Seq.empty) { lbls =>
  lbls.split(",").map(_.trim()).toSeq
}.mkString("\n")


