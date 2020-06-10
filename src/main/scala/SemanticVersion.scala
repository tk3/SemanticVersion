case class SemanticVersion(major: Int, minor: Int, patch: Int)

object SemanticVersion {

  def parser(versionString: String): SemanticVersion = {
    val params = versionString.split("\\.", 3)
    SemanticVersion(
      major = params(0).toInt,
      minor = params(1).toInt,
      patch = params(2).toInt
    )
  }
}
