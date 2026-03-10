package seedu.tutor.logic.commands;

public abstract class RelateCommand extends Command{

    public static RelateCommand create(Character type, String details) {
        if (type.equals('a')) {
            return new RelateAddCommand(details);
        } else if (type.equals('d')) {
            return new RelateDeleteCommand(details);
        } else {
            // should not reach here
            return null;
        }
    }
}
