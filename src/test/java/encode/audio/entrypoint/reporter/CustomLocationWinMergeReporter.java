package encode.audio.entrypoint.reporter;

import org.approvaltests.reporters.GenericDiffReporter;

import java.text.MessageFormat;

public class CustomLocationWinMergeReporter extends GenericDiffReporter
{
  public static final org.approvaltests.reporters.windows.WinMergeReporter INSTANCE     = new org.approvaltests.reporters.windows.WinMergeReporter();                       ;
  static final String                  DIFF_PROGRAM = "C:\\applications\\WinMerge\\WinMergeU.exe";
  static final String                  MESSAGE      = MessageFormat.format("Unable to find WinMerge at {0}"
                                                        + "\nYou can install it at http://winmerge.org/",
                                                        DIFF_PROGRAM);
  public CustomLocationWinMergeReporter()
  {
    super(DIFF_PROGRAM, MESSAGE);
  }
}
