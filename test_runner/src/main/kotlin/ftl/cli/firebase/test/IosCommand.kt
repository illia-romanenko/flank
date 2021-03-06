package ftl.cli.firebase.test

import ftl.cli.firebase.test.ios.IosDoctorCommand
import ftl.cli.firebase.test.ios.IosRunCommand
import ftl.cli.firebase.test.ios.IosTestEnvironmentCommand
import ftl.cli.firebase.test.ios.configuration.IosLocalesCommand
import ftl.cli.firebase.test.ios.models.IosModelsCommand
import ftl.cli.firebase.test.ios.orientations.IosOrientationsCommand
import ftl.cli.firebase.test.ios.versions.IosVersionsCommand
import picocli.CommandLine
import picocli.CommandLine.Command

@Command(
    name = "ios",
    synopsisHeading = "",
    subcommands = [
        IosRunCommand::class,
        IosDoctorCommand::class,
        IosModelsCommand::class,
        IosVersionsCommand::class,
        IosLocalesCommand::class,
        IosTestEnvironmentCommand::class,
        IosOrientationsCommand::class
    ],
    usageHelpAutoWidth = true
)
class IosCommand : Runnable {
    override fun run() {
        CommandLine.usage(IosCommand(), System.out)
    }
}
