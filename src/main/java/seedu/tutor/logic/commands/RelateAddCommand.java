package seedu.tutor.logic.commands;

import seedu.tutor.model.Model;
import seedu.tutor.model.person.Person;

public class RelateAddCommand extends RelateCommand{

    public RelateAddCommand(String details) {
        //
    }

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(null);
    }
}
