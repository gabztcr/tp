package seedu.address.logic.commands.person;

import static seedu.address.logic.commands.person.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.model.ModelPerson;
import seedu.address.model.ModelPersonManager;
import seedu.address.model.person.AddressBook;
import seedu.address.model.person.UserPrefs;
import seedu.address.model.person.person.Person;
import seedu.address.model.person.person.Remark;
import seedu.address.testutil.PersonBuilder;

class RemarkCommandTest {

    private ModelPerson modelPerson = new ModelPersonManager(getTypicalAddressBook(), new UserPrefs());

    @Test
    void execute_addRemarkUnfilteredList_success() {
        Person firstPerson = modelPerson.getFilteredPersonList().get(INDEX_FIRST_PERSON.getZeroBased());
        Person editedPerson = new PersonBuilder(firstPerson).withRemark("loves code").build();
        RemarkCommand remarkCommand = new RemarkCommand(INDEX_FIRST_PERSON, new Remark(editedPerson.getRemark().value));

        String expectedMessage = String.format(RemarkCommand.MESSAGE_ADD_REMARK_SUCCESS, editedPerson);

        ModelPerson expectedModelPerson =
                new ModelPersonManager(new AddressBook(modelPerson.getAddressBook()), new UserPrefs());
        expectedModelPerson.setPerson(modelPerson.getFilteredPersonList().get(0), editedPerson);

        assertCommandSuccess(remarkCommand, modelPerson, expectedMessage, expectedModelPerson);
    }
}
