package seedu.address.logic.commands.deliverable;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.deliverable.ModelDeliverable.PREDICATE_SHOW_ALL_DELIVERABLES;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.deliverable.ModelDeliverable;
import seedu.address.model.deliverable.deliverable.Deadline;
import seedu.address.model.deliverable.deliverable.Deliverable;
import seedu.address.model.util.Description;
import seedu.address.model.util.Title;

/**
 * Completes a deliverable
 */
public class DoneCommand extends Command {

    public static final String COMMAND_WORD = "done";
    private static final boolean COMPLETED = true;
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Marks as done the deliverable identified by the index number used in the displayed deliverable list\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_DONE_DELIVERABLE_SUCCESS = "Marked deliverable as done: %1$s";

    private final Index targetIndex;


    public DoneCommand(Index targetIndex) {
        requireNonNull(targetIndex);
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(ModelDeliverable modelDeliverable) throws CommandException {
        requireNonNull(modelDeliverable);
        List<Deliverable> lastShownList = modelDeliverable.getFilteredDeliverableList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_DELIVERABLE_DISPLAYED_INDEX);
        }

        Deliverable deliverableToComplete = lastShownList.get(targetIndex.getZeroBased());
        Deliverable completedDeliverable = createCompletedDeliverable(deliverableToComplete);
        modelDeliverable.setDeliverable(deliverableToComplete, completedDeliverable);
        modelDeliverable.updateFilteredDeliverableList(PREDICATE_SHOW_ALL_DELIVERABLES);
        return new CommandResult(String.format(MESSAGE_DONE_DELIVERABLE_SUCCESS, deliverableToComplete));
    }

    private Deliverable createCompletedDeliverable(Deliverable deliverableToComplete) {
        Title title = deliverableToComplete.getTitle();
        Description description = deliverableToComplete.getDescription();
        Deadline deadline = deliverableToComplete.getDeadline();
        String contacts = deliverableToComplete.getContacts();
        return new Deliverable(title, description, deadline, COMPLETED, contacts);
    }


}
