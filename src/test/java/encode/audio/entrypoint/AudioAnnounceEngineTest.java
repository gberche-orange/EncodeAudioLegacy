package encode.audio.entrypoint;

import encode.audio.entrypoint.reporter.CustomLocationWinMergeReporter;
import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

public class AudioAnnounceEngineTest {

	@Test
	public void checkJUnit() {
	}

	@Test
	// If the test cannot launch the default diff tool, try to set a reporter
	// with @UseReporter(...).
	// - For unix user, add @UseReporter(MeldReporter.class)
	// - For other users, see
	// http://blog.approvaltests.com/2011/12/using-reporters-in-approval-tests.html
    @UseReporter(value = CustomLocationWinMergeReporter.class)
	public void checkApprovalTestsReporter() throws Exception {
		Approvals.verify("My diff reporter open a new window of my default diff tool. It works!");
	}
}
