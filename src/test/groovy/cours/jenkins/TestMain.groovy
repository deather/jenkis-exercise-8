package cours.jenkins

import spock.lang.Specification

class TestMain extends Specification {

	def "ceci devrait fonctionner "() {
		when:
		String str = "null"

		then:
		str != null
	}

	def "ceci ne devrait pas fonctionner "() {
		when:
		String str = null

		then:
		str != null
	}
}
