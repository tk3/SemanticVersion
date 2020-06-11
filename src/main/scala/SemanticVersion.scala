case class SemanticVersion(major: Int, minor: Int, patch: Int)

object SemanticVersion {

  def parser(versionString: String): SemanticVersion = {
    val params = versionString.split("\\.", 3)
    params match {
      case Array(major) => SemanticVersion(
          major = major.toInt,
          minor = 0,
          patch = 0,
        )
      case Array(major, minor) => SemanticVersion(
        major = major.toInt,
        minor = minor.toInt,
        patch = 0
      )
      case Array(major, minor, patch) => SemanticVersion(
        major = major.toInt,
        minor = minor.toInt,
        patch = patch.toInt
      )
      case _ => throw new IllegalArgumentException(versionString)
    }
  }
}
