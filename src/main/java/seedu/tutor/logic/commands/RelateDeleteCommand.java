package seedu.tutor.logic.commands;

import seedu.tutor.model.Model;

public class RelateDeleteCommand extends RelateCommand{

    public RelateDeleteCommand(String details) {
        //
    }

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(null);
    }
}
