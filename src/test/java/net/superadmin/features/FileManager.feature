Feature: Validate SuperAdmin - File Manager

Background: 
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "**********"
Then user is to enter password as "***"
Then user is to click the button "SUBMIT"
Then user is to click the "File Manager"

Scenario: Add Folder Action verification
And user is to click the Add folder button
And user is to verify the New folder textbox
And user is to verify the Add button
And user is to verify the Cancel button
And user is to verify the Close button

Scenario: Upload File Action verification
And user is to click the Upload file button
And user is to verify the Choose file button 
And user is to verify the Upload button
And user is to verify the Cancel button
And user is to verify the Close button

Scenario: Go home and Back one level actions on main page verification
And user is to verify the Go home button on main page
And user is not allowed to click the Go home button
And user is to verify the Back one level button on main page
And user is not allowed to click the Back one level button

Scenario: Dropdown Entries and Settings menu verification
And user is to click the dropdown arrows
And user is to verify the options in the list
And user is to click the options in the list
And user is to verify all the actions in the Settings menu

Scenario: Next & Previous buttons and Documents verification
And user is to click the Next button
And user is to click the Previous button
And user is to verify the documents in the folders

Scenario: Go home and Back one level buttons verification
And user is to click the Folder
And user is to verify the documents
And user is to click the Go home button
And user is to click the Folder
And user is to click the Back one level button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the File Manager
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the File Manager
And user is to click the Forward navigation button

Scenario: Help dropdown button verification
And user is to click the Help dropdown button
And user is to verify About IETM in the dropdown
And user is to verify How to use IETM? in the dropdown
And user is to verify Version & Revision History in the dropdown

Scenario: Logout button verification
And user is to click the Logout button
And user is to click the Close button
And user is to click the No button 
And user is to click the Yes button
