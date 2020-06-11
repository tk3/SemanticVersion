import org.scalatest.WordSpec

class SemanticVersionSpec extends WordSpec {
  "parser" when {
    "1" should {
      "major = 1, minor = 0, patch = 0" in {
        val actual = SemanticVersion.parser("1")

        assert(actual.major == 1)
        assert(actual.minor == 0)
        assert(actual.patch == 0)
      }
    }

    "1.1" should {
      "major = 1, minor = 1, patch = 0" in {
        val actual = SemanticVersion.parser("1.1")

        assert(actual.major == 1)
        assert(actual.minor == 1)
        assert(actual.patch == 0)
      }
    }

    "1.1.1" should {
      "major = 1, minor = 1, patch = 1" in {
        val actual = SemanticVersion.parser("1.1.1")

        assert(actual.major == 1)
        assert(actual.minor == 1)
        assert(actual.patch == 1)
      }
    }
  }
}
