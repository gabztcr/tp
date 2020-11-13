---
layout: page
title: User Guide
---
<div>
<p align = "center">
    <img style="-webkit-box-shadow: none; -moz-box-shadow: none; box-shadow: none;" src="images/productivDuck.png" width="300px" height="300px">
</p>
</div>

<div>
    <p style= "text-align: center">
    <h1 style = "text-align: center">
    <span style = "color: #00c853; font-size: 60px" >Productiv
    </span>
    </h1>
    </p>
</div>
<div>
    <p style= "text-align: center">
    <span style = "font-size: 30px">Get Quacking with
    </span>
    <span style = "font-size: 30px; color : #00c853"> Productiv!
    </span>
    </p>
</div>
<div>
    <h1 style = "text-align: center"><strong>Contributors</strong></h1>
    <p style= "text-align: center">Merlin Lim</p>
    <p style= "text-align: center">Gabriel Tan</p>
    <p style= "text-align: center">Chrystal Quek</p>
    <p style= "text-align: center">Clara Adora</p>
    <p style= "text-align: center">Cao Wenjie</p>
</div>

<div style="page-break-after: always;"></div>

## Table of Contents

1. [Welcome to Productiv](#1-welcome-to-productiv)
2. [Reading the user guide](#2-reading-the-user-guide)
3. [Getting started](#3-getting-started)
4. [Features](#4-features)
5. [Commands](#5-commands)
    - [3.1 General](#31-general)
        * [3.1.1 Switching modes: `switch`](#311-switching-modes---switch-)
        * [3.1.2 Viewing help: `help`](#312-viewing-help---help-)
        * [3.1.3 Exiting Productiv: `exit`](#313-exiting-productiv---exit-)
        * [3.1.4 Saving the data](#314-saving-the-data)
    - [3.2 Dashboard](#32-dashboard)
    - [3.3 Deliverable](#33-deliverable)
        * [3.3.1 Adding a deliverable: `add`](#331-adding-a-deliverable---add-)
        * [3.3.2 Editing a deliverable: `edit`](#332-editing-a-deliverable---edit-)
        * [3.3.3 Marking a deliverable as completed: `done`](#333-marking-a-deliverable-as-completed---done-)
        * [3.3.4 Marking a deliverable as on-going: `undone`](#334-marking-a-deliverable-as-on-going---undone-)
        * [3.3.5 Viewing a deliverable: `view`](#335-viewing-a-deliverable---view-)
        * [3.3.6 Finding deliverables: `find`](#336-finding-deliverables---find-)
        * [3.3.7 Listing all deliverables: `list`](#337-listing-all-deliverables---list-)
        * [3.3.8 Deleting a deliverable: `delete`](#338-deleting-a-deliverable---delete-)
        * [3.3.9 Clearing all deliverables: `clear`](#339-clearing-all-deliverables---clear-)
    - [3.4 Meeting](#34-meeting)
        * [3.4.1 Adding a meeting: `add`](#341-adding-a-meeting---add-)
        * [3.4.2 Editing a meeting: `edit`](#342-editing-a-meeting---edit-)
        * [3.4.3 Viewing a meeting: `view`](#343-viewing-a-meeting---view-)
        * [3.4.4 Finding meetings: `find`](#344-finding-meetings---find-)
        * [3.4.5 Listing all meetings: `list`](#345-listing-all-meetings---list-)
        * [3.4.6 Deleting a meeting: `delete`](#346-deleting-a-meeting---delete-)
        * [3.4.7 Clearing all meetings: `clear`](#347-clearing-all-meetings---clear-)
    - [3.5 Contact](#35-contact)
        * [3.5.1 Adding a contact: `add`](#351-adding-a-contact---add-)
        * [3.5.2 Editing a contact: `edit`](#352-editing-a-contact---edit-)
        * [3.5.3 Viewing a contact: `view`](#353-viewing-a-contact---view-)
        * [3.5.4 Finding contacts: `find`](#354-finding-contacts---find-)
        * [3.5.5 Listing all contacts: `list`](#355-listing-all-contacts---list-)
        * [3.5.6 Deleting a contact: `delete`](#356-deleting-a-contact---delete-)
        * [3.5.7 Clearing all contacts: `clear`](#357-clearing-all-contacts---clear-)
6. [Final remarks](#6-final-remarks)
7. [FAQ](#7-faq)
8. [Command summary](#8command-summary)
    - [8.1 General](#81-general)
    - [8.2 Deliverable](#82-deliverable)
    - [8.3 Meeting](#83-meeting)
    - [8.4 Contact](#84-contact)
9. [Glossary](#9-glossary)
<div style="page-break-after: always;"></div>

--------------------------------------------------------------------------------------------------------------------

## 1. Welcome to Productiv  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

Are you a product manager looking for a simple way to organise your many product development tasks?
Or ever found yourself in dire need to conveniently reference your various product-related information? 
_Then this app is for you!_

Productiv is a one-stop desktop application for product managers like yourself to organise your **deliverables**, 
**meetings** and **contacts** so that you can track your product's development easily. 

Able to type fast? Great! Productiv is optimized for use via Command Line Interface (CLI), 
which means you will be able to manage your product-related information swiftly using simple commands. 
Nevertheless, Productiv has elements of Graphical User Interface (GUI) for your benefit.

Read on, if you are keen to know more, and we'll take you through this journey to _get quacking with Productiv_!

<div style="page-break-after: always;"></div>

## 2. Reading the user guide  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

In this user guide, you will see several icons and text styles that will aid you in your Productiv journey.
View the table below to understand their meaning and usage.

Icon/Text Style | Description                    
----------------|-------------------------------------------------
[hyperlink](##)   | Clicking it takes you to the relevant section in this guide (except [here](##) hyperlinks, which takes you to other sites).
`Markdown`      | Represents a command/part of a command.
[<img src="images/productivDuck.png" style="width:30px;height:30px;" alt="duck">](#table-of-contents)     | Clicking it takes you back to the Table of Contents.
<div markdown="block" class="alert alert-success">:information_source:</div> | Represents a note for your information.
<div markdown="span" class="alert alert-primary">:bulb:</div> | Represents a tip for your benefit.

Other than reading, you are highly encouraged to watch the demo video of Productiv [here](https://tiny.cc/Productiv-Demo-Video) to supplement this user guide.

## 3. Getting started  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

Ready to be productive? Follow the steps here to _get quacking with Productiv_:

1. Ensure you have **Java 11** installed in your computer (it should be your default Java version).

1. Download the latest **productiv.jar** file from [here](https://github.com/AY2021S1-CS2103T-F11-2/tp/releases).

1. Copy the file to an empty folder.

1. Double-click the file to launch Productiv. 

## 4. Features  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

Now that you have Productiv up and running, let's get familiarised with the features of Productiv.

### 4.1 Modes  
To enhance your product management, here are the 4 modes that are available for you:
* **Dashboard**: Gives you an overview of your product’s development and upcoming events so that you can work better towards production deadlines.

* **Deliverable**: Helps you track your product’s deliverables so that you can aim better to meet them.

* **Meeting**: Helps you manage your product-related meetings so that you can be clearer about your meeting schedule.

* **Contact**: Helps you organise your developer or stakeholder contacts so that you can reference them easily.

### 4.2 Layout
 
Next, let's get acquainted with Productiv's application layout.
If you have launched Productiv, you should see a dashboard similar to the figure below.

<p align="center">
<img src="images/UiLabel.png" alt="Ui Label">
<i>Figure 1: Layout of Productiv</i>
</p>
<br>

Here is the main list of Productiv's layout components and what you can do with them:
   * **Navigation bar**: Navigate to other modes. 
   
   * **Command box**: Enter your commands. 
   
   * **Feedback box**: View success or error messages based on your commands.
   
   * **Left panel**: View your product's overall completion percentage or a list of your deliverables/meetings/contacts (depending on your current mode)
   
   * **Right panel**: View your product management schedule or an expanded view of your selected deliverable/meeting/contact (depending on your current mode)

<div markdown="block" class="alert alert-info">

**:information_source: Note** For modes other than the dashboard, you can see the respective data file path at the bottom of the application. 

</div>

### 4.3 Dashboard  

Whenever you start up Productiv, you will be brought to the dashboard, which gives you an overview of your product-related information.
Referencing Figure 1 above, you can see the Overall Completion Percentage (OCP) displayed in the left panel. 
The OCP gives you a quick overview of the progress of your product’s development.
Also, your schedule will be displayed in the right panel. 
It contains all your deliverables and meetings, chronologically sorted.

### 4.4 Command preview  

All that's left now is to execute some simple commands in Productiv!
This can be done by typing in the command box and pressing the Enter key. 
Here is a sequence of example commands you can try:

   1. `switch dv`: Switches to deliverable mode.
   
   1. `view 1`: Displays the 1st deliverable shown.
   
   1. `delete 1`: Deletes the 1st deliverable shown.

And it's as simple as that! But of course, there's more to just these three commands.

## 5. Commands  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

This section provides a list of all the available commands and their functions for you to improve your productivity.
Do take your time to explore each one of them so that you can fully utilize the app.
Ultimately, _Productiv is designed to make product management more convenient and powerful for you_.

Now, let's first understand the common components found in a typical command:<br>

Component | Description |
---------------------|------------|
Command word | The first word of a command. It is the action that you want to perform. |
Prefix | The characters before the parameter. It is the short-form of the corresponding field. |
Parameter |	The words following each prefix. It represents the value of the corresponding field. |

For example, here's the breakdown of the command `add t/TITLE by/DEADLINE m/MILESTONE [c/CONTACTS] [d/DESCRIPTION]`:
* Command word: `add`

* Prefixes: `t/`, `by/`, `m/`, `c/`, `d/`

* Parameters: `TITLE`, `DEADLINE`, `MILESTONE`, `CONTACTS`, `DESCRIPTION`

<div markdown="block" class="alert alert-success">

**:information_source: Note:** Prefix-parameter pairs in square brackets are optional, i.e. `[c/CONTACTS]` and `[d/DESCRIPTION]` need not be present in this command.

</div>

### 5.1 General   [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

These are commands that can be executed while in any mode. Use them whenever!

#### 5.1.1 Switching modes: `switch`

Switches to dashboard, deliverable, meeting or contact mode so that you can have an overview of your product's development 
or organise different types of product-related information.

Format: `switch MODE`

Parameter      | Description                  | Examples
---------------|------------------------------| --------------------------------
`MODE`         | The mode that you wish to navigate to. <br><br> It can only be one of the following:  <br>&emsp;&bull; Dashboard<br> &emsp;&bull; Deliverable<br> &emsp;&bull; Meeting<br> &emsp;&bull; Contact | The following are the only valid inputs:<br>&emsp;&bull;`db` (Dashboard)<br> &emsp;&bull;`dv` (Deliverable)<br> &emsp;&bull;`m` (Meeting)<br> &emsp;&bull;`c` (Contact)

<div markdown="block" class="alert alert-success">

**:information_source: Note:** How some commands will be executed depend on which mode you are currently in, 
e.g. `delete 1` in meeting mode deletes the 1st meeting shown, but in contact mode, it deletes the 1st contact displayed. 

</div>

#### 5.1.2 Viewing help: `help`

Shows a message as shown below that directs you to this User Guide so you can easily reference the relevant features or commands.

<div align = "left">
<p align="center">
   
<img src="images/helpMessage.JPG" alt="Help message">
<i>Figure 2: Help Message</i>
   
</p>
</div>
<br>

Format: `help`

#### 5.1.3 Exiting Productiv: `exit`

Exits the application and automatically saves any changes you have made so that you can work on them later.

Format: `exit`

### 5.2 Deliverable  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)
These are commands that you can use to track your product's deliverables so that you can work better towards meeting them.
The following figure shows how the deliverable mode appears in Productiv.

<p align="center">
  
<img src="images/Deliverable.png" alt="Deliverable">
<i>Figure 3: Deliverable mode display</i>
  
</p>
<br>

<div markdown="block" class="alert alert-success">

**:information_source: Note:** You must be in the deliverable mode to execute the following commands. 
Refer to [switch](#311-switching-modes---switch-) for more information on switching modes.

</div>

#### 5.2.1 Adding a deliverable: `add`

Adds a deliverable to your deliverable list so that you can start keeping track of it.

Format: `add t/TITLE by/DEADLINE m/MILESTONE [c/CONTACTS] [d/DESCRIPTION]`

Parameter      | Description                   | Example(s)
---------------|-------------------------------|--------------------------------
`TITLE`        | The main heading of your deliverable.| `Create login screen`
`DEADLINE`     | The due date time of your deliverable.<br><br>Details:<br>&emsp;&bull; It must not be earlier than the year 2019.<br>&emsp;&bull; It is in dd-MM-yyyy HH:mm format.| `30-12-2020 18:00`
`MILESTONE`    | The milestone tagged to your deliverable.<br><br>Detail:<br/>It is a non-negative integer, or a period-separated string of non-negative integers. | <br>&bull;`2`<br>&bull;`14.2.1`
`CONTACTS`     | The contact(s) involved in seeing through your deliverable.<br><br>Detail: <br/>It is a name, or a comma-separated string of names. | <br>&bull;`conan`<br>&bull;`Zachary, drew, Paul Smith`
`DESCRIPTION`  | Any additional information about your deliverable.|`Remember to include email and password fields`


<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s OCP and Schedule will be updated accordingly.

</div>

Examples:
* `add t/Login screen by/10-10-2020 18:00 m/1.1 c/Jordan Woods, Betsy Crowe d/Include email and password fields` 
adds a deliverable with the title `Login screen`, deadline `10-10-2020 18:00`, 
milestone `1.1`, contacts `Jordan Woods, Betsy Crowe` and description `Include email and password fields`.
* `add t/Find profile page template by/08-12-2020 12:00 m/2.1.1` 
adds a deliverable with the title `Find profile page template`, deadline `08-12-2020 12:00` and milestone `2.1.1`.

#### 5.2.2 Editing a deliverable: `edit`

Edits an existing deliverable in your displayed deliverable list so that you can keep it updated.

Format: `edit INDEX [t/TITLE] [by/DEADLINE] [m/MILESTONE] [c/CONTACTS] [d/DESCRIPTION] `

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the deliverable you wish to edit in your displayed deliverable list. <br><br>Detail:<br>It must be a positive integer. |`1`: Represents the 1st deliverable in your list

<div markdown="block" class="alert alert-success">

**:information_source: Notes:**

* At least one of the fields of the deliverable must be changed.
* You can clear an optional field by inputting an empty parameter, e.g. `edit 1 d/` will empty the description of the 1st deliverable.
* The dashboard’s Schedule will be updated accordingly.

</div>

Examples:
*  `edit 1 d/Must include username, email and password fields by/15-12-2020 12:00`
edits the description of the 1st deliverable to be `Must include username, email and password fields`
and its deadline to be `15-12-2020 12:00`.
*  `edit 2 c/` clears the optional contacts field of the 2nd deliverable.

#### 5.2.3 Marking a deliverable as completed: `done`

Marks the specified deliverable from your displayed deliverable list as completed so you know you have met it.

Format: `done INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the deliverable you wish to mark as completed in your displayed deliverable list. <br><br>Detail: <br>It must be a positive integer. |`2`: Represents the 2nd deliverable in your list

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s OCP and Schedule will be updated accordingly.

</div>

Example:
* `done 1` marks the 1st deliverable in your displayed deliverable list as completed.

#### 5.2.4 Marking a deliverable as on-going: `undone`

Marks the specified deliverable from your displayed deliverable list as on-going in the case you have mistakenly marked it completed.

Format: `undone INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the deliverable you wish to mark as on-going in your displayed deliverable list. <br><br>Detail:<br>It must be a positive integer. |`2`: Represents the 2nd deliverable in your list

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s OCP and Schedule will be updated accordingly.

</div>


Example:
* `undone 1` marks the 1st deliverable in your displayed deliverable list as on-going.

#### 5.2.5 Viewing a deliverable: `view`

Displays more details of the specified deliverable from your displayed deliverable list for a closer examination.
The following figure shows how the deliverable mode appears after executing the command.

<p align="center">
 
<img src="images/DeliverableView.png" alt="Deliverable View">
<i>Figure 4: Deliverable mode display after view command</i>
 
</p>

Format: `view INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the deliverable you wish to view in your displayed deliverable list. <br><br>Detail:<br>It must be a positive integer. |`2`: Represents the 2nd deliverable in your list

Example:
* `view 2` views the 2nd deliverable in your displayed deliverable list.
  
   
#### 5.2.6 Finding deliverables: `find`

Finds the deliverables whose titles or descriptions contain any of the given keywords for a quicker search.

Format: `find KEYWORDS`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`KEYWORDS`     | One or more keywords used to search for the deliverables you need. <br><br>Details:<br>&emsp;&bull; Searches based on title and description.<br>&emsp;&bull; Searches are case-insensitive, <br>&emsp;&nbsp;e.g. `homepage` will match `Homepage`.| `Homepage Navigation`: Will match phrases such as `Complete homepage` and `Increase size of Navigation Bar`

<div markdown="span" class="alert alert-primary">:bulb:

**Tip:** Use the `list` command when you want to list all your deliverables back after using the `find` command.
Refer to [Listing all deliverables](#337-listing-all-deliverables---list-) below for details of the `list` command.
</div>

Examples:
* `find mock-up urgent` returns a deliverable with title `Finish mock-ups` and another with description `This is urgent and important!`.
* `find plan` returns a deliverable with title `Finalise design and plan` and another with description `Reminder to plan time wisely.`.

#### 5.2.7 Listing all deliverables: `list`

Lists out all deliverables in your deliverable list, if any, for a macro-level inspection.

Format: `list`

#### 5.2.8 Deleting a deliverable: `delete`

Deletes the specified deliverable from your deliverable list so that you can focus on other relevant deliverables.

Format: `delete INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`     | The index number of the deliverable you wish to delete in your displayed deliverable list. <br><br>Detail:<br>It must be a positive integer. | `2`: Represents the 2nd deliverable in your list

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s OCP and Schedule will be updated accordingly.

</div>

Example:
* `delete 2` deletes the 2nd deliverable in your deliverable list.

#### 5.2.9 Clearing all deliverables: `clear`

Clears all deliverables from your deliverable list, if any, so that you can start your list afresh.

Format: `clear`

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s OCP and Schedule will be updated accordingly.

</div>

### 5.3 Meeting  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

These are commands that you can use to manage your product-related meetings so that you can be clear on your meeting schedule.
The following figure shows how the meeting mode appears in Productiv.

<p align="center">
 
<img src="images/Meeting.png" alt="Meeting">
<i>Figure 5: Meeting mode display</i>
 
</p>
<br>
   
<div markdown="block" class="alert alert-success">

**:information_source: Note:** You must be in the meeting mode to execute the following commands. 
Refer to [switch](#311-switching-modes---switch-) for more information on switching modes.

</div>   
 
#### 5.3.1 Adding a meeting: `add`

Adds a meeting to your meeting list so that you can start keeping track of it.

Format: `add t/TITLE from/FROM to/TO [c/CONTACTS] [l/LOCATION] [d/DESCRIPTION]`

Parameter      | Description                   | Example(s) 
---------------|-------------------------------|--------------------------------
`TITLE`        | The main heading of your meeting.| `Daily stand-up meeting`
`FROM`         | The start date and time of your meeting.<br><br>Details:<br>&emsp;&bull; It must not be earlier than the year 2019.<br>&emsp;&bull; It is in dd-MM-yyyy HH:mm format.| `30-12-2020 18:00` |
`TO`           | The end time of your meeting.<br><br>Detail:<br/>It is in HH:mm format. |`20:OO`
`CONTACTS`     | The contact(s) involved in your meeting.<br><br>Detail: <br/>It is a name, or a comma-separated string of names. | <br>&bull;`Louisa Kennedy`<br>&bull;`Nancy, Abraham, Sarah`
`LOCATION`     | The location of your meeting. | `Meeting room 1B`
`DESCRIPTION`  | Any additional information about your meeting.|`Remember to plan the agenda before the meeting`

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s Schedule will be updated accordingly.

</div>

Example:
* `add t/Discuss app requirements from/11-12-2020 09:00 to/10:00 c/Jordan Woods, Betsy Crowe d/Refine with business associates`
adds a meeting with the title `Discuss app requirements`, start date and time `11-12-2020 09:00`, 
end time `10:00`, contacts `Jordan Woods, Betsy Crowe` and description `Refine with business associates`.
* `add t/User research review from/15-12-2020 13:00 to/15:00 l/Meeting room A` 
adds a meeting with the title `User research review`, start date and time `15-12-2020 13:00`, 
end time `15:00` and location `Meeting room A`.

#### 5.3.2 Editing a meeting: `edit`

Edits an existing meeting in your displayed meeting list so that you can keep it updated.

Format: `edit INDEX [t/TITLE] [from/FROM] [to/TO] [c/CONTACTS] [l/LOCATION] [d/DESCRIPTION]`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the meeting you wish to edit in your displayed meeting list. <br><br>Detail:<br>It must be a positive integer. |`1`: Represents the 1st meeting in your list


<div markdown="block" class="alert alert-success">

**:information_source: Notes:**

* At least one of the fields of your meeting must be changed.
* You can clear an optional field by inputting an empty parameter, e.g. `edit 1 d/` will empty the description of your 1st meeting.
* The dashboard’s Schedule will be updated accordingly.

</div>

Examples:
* `edit 2 t/Discuss final release features d/Finalise dashboard functions`
edits the title of the 2nd meeting to be `Discuss final release features` 
and its description to be `Finalise dashboard functions`.
* `edit 4 c/` clears the optional contact field of the 4th meeting.

#### 5.3.3 Viewing a meeting: `view`

Displays more details of the specified meeting from your displayed meeting list for a closer examination.
The following figure shows how the meeting mode appears after executing the command.

<p align="center">
 
<img src="images/MeetingView.png" alt="Meeting View">
<i>Figure 6: Meeting mode display after view command</i>
 
</p>

Format: `view INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the meeting you wish to view in your displayed meeting list. <br><br>Detail:<br>It must be a positive integer. |`2`: Represents the 2nd meeting in your list

Example:
* `view 2` views the 2nd meeting in your meeting list.

#### 5.3.4 Finding meetings: `find`

Finds the meetings whose titles or descriptions contain any of the given keywords for a quicker search.

Format: `find KEYWORDS`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`KEYWORDS`     | One or more keywords used to search for the meetings you need. <br><br>Details:<br>&emsp;&bull; Searches based on title and description.<br>&emsp;&bull; Searches are case-insensitive, <br>&emsp;&nbsp;e.g. `discussion` will match `Discussion`.| `Consult mentor`: Will match phrases such as `Consult advisor` and `Pitch to mentor`

<div markdown="span" class="alert alert-primary">:bulb:

**Tip:** Use the `list` command when you want to list all your meetings back after using the `find` command.
Refer to [Listing all meetings](#345-listing-all-meetings---list-) below for details of the `list` command.
</div>

Examples:
* `find Survey` returns a meeting with title `Survey potential customers` and another with description `Don't forget to present survey results.`.
* `find consult goals` returns a meeting with title `Consult about marketing goals` and another with description `Goals must be achieved!`.

#### 5.3.5 Listing all meetings: `list`

Lists out all meetings in your meeting list, if any, for a macro-level inspection.

Format: `list`

#### 5.3.6 Deleting a meeting: `delete`

Deletes the specified meeting from your displayed meeting list in the case that it has been cancelled or outdated.

Format: `delete INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`     | The index number of the meeting you wish to delete in your displayed meeting list. <br><br>Detail:<br>It must be a positive integer. | `2`: Represents the 2nd meeting in your list

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s Schedule will be updated accordingly.

</div>

Example:
* `delete 3` deletes the 3rd meeting in your displayed meeting list.

#### 5.3.7 Clearing all meetings: `clear`

Clears all meetings from your meeting list, if any, so that you can start your list afresh.

Format: `clear`

<div markdown="block" class="alert alert-success">

**:information_source: Note:** The dashboard’s Schedule will be updated accordingly.

</div>

### 5.4 Contact  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

These are commands that you can use to organise your developer or stakeholder contacts so that you reference them easily.
The following figure shows how the contact mode appears in Productiv.

<p align="center">
 
<img src="images/Contact.png" alt="Contact">
<i>Figure 7: Contact mode display</i>
 
</p>
<br>

<div markdown="block" class="alert alert-success">

**:information_source: Note:** You must be in the contact mode to execute the following commands. 
Refer to [switch](#311-switching-modes---switch-) for more information on switching modes.

</div> 

#### 5.4.1 Adding a contact: `add`

Adds a developer or stakeholder to your contact list so that you can store their details for future communication.

Format: `add n/NAME r/ROLE e/EMAIL [p/PHONE] [d/DESCRIPTION]`

Parameter      | Description                   | Example(s) 
---------------|-------------------------------|--------------------------------
`NAME`         | The name of your contact.| `James Tan`
`ROLE`         | Your contact can only belong to one of the two roles:<br>&emsp;&bull; Developer <br>&emsp;&bull; Stakeholder | Only the following inputs are valid: <br>&emsp;&bull;`dev` (Developer)<br>&emsp;&bull;`stk` (Stakeholder)
`EMAIL`        | The email address of your contact |`james_tan@gmail.com`
`PHONE`        | The mobile or office number of your contact | `81234567`
`DESCRIPTION`  | Any additional information about your contact, such as job position.|`CEO of Carousell`

<div markdown="span" class="alert alert-primary">:bulb:

**Tip:** Leave out the + sign for `PHONE`s with country codes.

</div>

Examples:
* `add n/Jordan Woods r/dev e/jordanwoods@glutter.com p/81234567`
adds a developer with the name `Jordan Woods`, email `jordanwoods@glutter.com` and phone number `81234567`.
* `add n/Betsy Crowe r/stk e/betsybet872@pmail.com`
adds a stakeholder with the name `Betsy Crowe` and email `betsybet872@pmail.com`.

#### 5.4.2 Editing a contact: `edit`

Edits an existing contact in your displayed contact list so that you can keep it updated.

Format: `edit INDEX [n/NAME] [r/ROLE] [e/EMAIL] [p/PHONE] [d/DESCRIPTION]`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the contact you wish to edit in your displayed deliverable list. <br><br>Details:<br>It must be a positive integer. |`1`: Represents the 1st contact in your list


<div markdown="block" class="alert alert-success">

**:information_source: Note:**

* At least one of the fields of your contact must be changed.
* You can clear an optional field by inputting an empty parameter, e.g. `edit 1 d/` will empty the description of your 1st contact.

</div>

Examples:
*  `edit 1 e/jeremysand@glutter.com p/81234567`
edits the email and phone number of the 1st contact to be `jeremysand@glutter.com` and `81234567` respectively.
*  `edit 2 p/` 
clears the optional phone field of the 2nd contact.

#### 5.4.3 Viewing a contact: `view`

Displays more details of the specified contact from your displayed contact list for a closer examination.
The following figure shows how the contact mode appears after executing the command.

<p align="center">
 
<img src="images/ContactView.png" alt="Contact View">
<i>Figure 8: Contact mode display after view command</i>
 
</p>

Format: `view INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`        | The index number of the contact you wish to view in your displayed meeting list. <br><br>Detail:<br>It must be a positive integer. |`2`: Represents the 2nd contact in your list

Example:
* `view 2` views the 2nd contact in your contact list.

#### 5.4.4 Finding contacts: `find`

Finds the contacts whose names or descriptions contain any of the given keywords for a quicker search.

Format: `find KEYWORDS`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`KEYWORDS`     | One or more keywords used to search for the contacts you need. <br><br>Details:<br>&emsp;&bull; Searches based on name and description.<br>&emsp;&bull; Searches are case-insensitive, <br>&emsp;&nbsp;e.g. `james` will match `James`.| `James designer`: Will match phrases such as `James Tan` and `Graphic designer`

<div markdown="span" class="alert alert-primary">:bulb:

**Tip:** Use the `list` command when you want to list all your contacts back after using the `find` command.
Refer to [Listing all contacts](#355-listing-all-contacts---list-) below for details of the `list` command.
</div>

Examples:
* `find alex yeoh` returns a contact with name `Alex Yeoh` and another with description `Business analyst. Alex works with him.`.
* `find Johnson` returns a contact with name `Amber Johnson` and another with description `Works at Johnson & Johnson`.

#### 5.4.5 Listing all contacts: `list`

Lists out all contacts from your contact list, if any, for a macro-level inspection.

Format: `list`

#### 5.4.6 Deleting a contact: `delete`

Deletes the specified contact from your displayed contact list in the case it has become unimportant.

Format: `delete INDEX`

Parameter      | Description                   | Example 
---------------|-------------------------------|--------------------------------
`INDEX`     | The index number of the contact you wish to delete in your displayed contact list. <br><br>Detail:<br>It must be a positive integer. | `2`: Represents the 2nd contact in your list

Example:
* `delete 3` deletes the 3rd contact in the displayed contact list.

#### 5.4.7 Clearing all contacts: `clear`

Clears all contacts from your contact list, if any, so that you can start your list afresh.

Format: `clear`

## 6. Final remarks  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

Now that you have seen the full list of available commands, 
you are ready to take your product management to the next level independently.

Need help with Productiv in the future? Don't worry! 
You can always refer back to this user guide to familiarise with the application again.

Until then, this one-stop desktop app will continue to provide you with convenience and enhance your productivity.
So what are you waiting for? It's time to _get quacking with Productiv_!

--------------------------------------------------------------------------------------------------------------------

## 7. FAQ  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

**Q**: Is Productiv available on Windows and Mac?<br>
**A**: Absolutely! Just ensure that you have **Java 11** installed on your computer and it is your default Java version.

**Q**: How many deliverables, meetings and contacts can I store in Productiv?<br>
**A**: Productiv can support up to 1000 deliverables, 1000 meetings and 1000 contacts.

**Q**: Can I recover deleted deliverables, meetings and contacts?<br>
**A**: Unfortunately, you won't be able to recover your deleted items so be very careful before deciding to delete or clear any items.

**Q**: Can I manage multiple products on Productiv?<br>
**A**: Currently, Productiv is catered for a single product. However, future versions will allow you to manage multiple products together, so stay tuned!

---------------------------------------------------------------------------------------------------------------------

## 8.Command summary  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

### 8.1 General 

Command        | Format        | Example
---------------|---------------|-----------------------------------------------------------------------------------
Switch         | `switch MODE` | `switch dv`
Help           | `help`        | `help`
Exit           | `exit`        | `exit`

### 8.2 Deliverable

Command        | Format        | Example
---------------|---------------|-----------------------------------------------------------------------------------
Add            | `add t/TITLE by/DEADLINE m/MILESTONE [c/CONTACTS] [d/DESCRIPTION]` | `add t/Login screen by/10-10-2020 18:00 m/1.1 c/Jordan Woods, Betsy Crowe d/Include email and password fields`
Edit           | `edit INDEX [t/TITLE] [by/DEADLINE] [m/MILESTONE] [c/CONTACTS] [d/DESCRIPTION]` | `edit 1 by/14-12-2020 12:00 d/Must include username, email and password fields`
Mark as completed   | `done INDEX` | `done 3`
Mark as on-going    | `undone INDEX` | `undone 1`
View           | `view INDEX`  |  `view 2`
Find           | `find KEYWORDS`  |  `find Homepage urgent`
List           | `list`  | `list`
Delete         | `delete INDEX`  |  `delete 3`
Clear          | `clear` | `clear`

### 8.3 Meeting

Command        | Format        | Example
---------------|---------------|-----------------------------------------------------------------------------------
Add            | `add t/TITLE from/FROM to/TO [c/CONTACTS] [l/LOCATION] [d/DESCRIPTION]`   |   `add t/Discuss app requirements from/11-12-2020 09:00 to/10:00 c/Jordan Woods, Betsy Crowe l/Meeting Room A d/Refine with business associates`
Edit           | `edit INDEX [t/TITLE] [from/FROM] [to/TO] [c/CONTACTS] [l/LOCATION] [d/DESCRIPTION]`   |   `edit 2 t/Discuss final release features d/Finalise dashboard functions`
View           | `view INDEX`   |   `view 2`
Find           | `find KEYWORDS`   |   `find discuss user guide John`
List           | `list`   | `list`
Delete         | `delete INDEX`   |   `delete 3`
Clear          | `clear`  | `clear`

### 8.4 Contact

Command        | Format        | Example
---------------|--------------|-----------------------------------------------------------------------------------
Add            | `add n/NAME r/ROLE e/EMAIL [p/PHONE] [d/DESCRIPTION]`   |   `add n/Johnny r/stk e/johnny@example.com p/12345678 d/Business Analyst`
Edit           | `edit INDEX [n/NAME] [r/ROLE] [e/EMAIL] [p/PHONE] [d/DESCRIPTION]`   |   `edit 1 n/John r/dev e/john@email.com`
View           | `view INDEX`   |   `view 2`
Find           | `find KEYWORDS`   |   `find John Kite`
List           | `list`   | `list`
Delete         | `delete INDEX`   |   `delete 3`
Clear          | `clear`  | `clear`

---------------------------------------------------------------------------------------------------------------------

## 9. Glossary  [<img src="images/productivDuck.png" style="float:right;width:30px;height:30px;" alt="duck">](#table-of-contents)

Term                | Description
--------------------------------|------------------------------------------------------------------------------------------------|
Command Line Interface (CLI)   | A text-based user interface (UI) used to view and manage computer files.                       |
Graphical User Interface (GUI) | A system of interactive visual components for computer software.                               |                         |
Milestone                      | A stage in the software development process associated with a particular group of deliverables. It is a non-negative integer, or a period-separated string of non-negative integers. |
Mode                           | The state of the application that affects how each command will be executed. The app can be in dashboard, deliverable, meeting or contact mode.                                                  |
Overall Completion Percentage (OCP) | A donut chart showing the product’s completion status, found on the left panel of the dashboard mode. |
