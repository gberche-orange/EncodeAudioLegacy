package encode.audio.entrypoint.reporter;

import org.approvaltests.reporters.GenericDiffReporter;

import java.text.MessageFormat;

public class Win764WinBitsMergeReporter extends GenericDiffReporter
{
  public static final org.approvaltests.reporters.windows.WinMergeReporter INSTANCE     = new org.approvaltests.reporters.windows.WinMergeReporter();                       ;
  static final String                  DIFF_PROGRAM = "C:\\Program Files (x86)\\WinMerge\\WinMergeU.exe";
  static final String                  MESSAGE      = MessageFormat.format("Unable to find WinMerge at {0}"
                                                        + "\nYou can install it at http://winmerge.org/",
                                                        DIFF_PROGRAM);
  public Win764WinBitsMergeReporter()
  {
    super(DIFF_PROGRAM, MESSAGE);
  }
}
