Feature: Validate SuperAdmin - Edit IETM

Background:
Given user opens the "Chrome" browser
When user enters the url as "http://ietm.codeandpixels.net/#/"
Then user is to enter username as "**********"
Then user is to enter password as "***"
Then user is to click the button "SUBMIT"
Then user is to click the "Edit IETM"
And user is to click General Information module

Scenario: Contents verification
And user is to click the Abbreviations content
And user is to click the videos used in this IETM content
And user is to click the Terms and Definitions content


Scenario: Add New Page action verification
And user is to click the Add New Page action
And user is to verify the textboxes of Add New Page
And user is to verify the Add New Related content action of Add New Page
And user is to verify the Access rights checkboxes of Add New Page
And user is to verify the Save button of Add New Page

Scenario: Edit Page action verification
And user is to click the Edit Page action
And user is to verify the textboxes of Edit Page
And user is to verify the Add New Related content action of Edit Page
And user is to verify the Access rights checkboxes of Edit Page
And user is to verify the Save button of Edit Page

Scenario: Add Main Page action verification
And user is to click the Add Main Page action
And user is to verify the textboxes of Add Main Page
And user is to verify the Add New Related content action of Add Main Page
And user is to verify the Access rights checkboxes of Add Main Page
And user is to verify the Save button of Add Main Page

Scenario: Next & Previous and Related content buttons verification
And user is to click the Next button
And user is to click the Previous button
And user is to click the Related Content button
And user is to click the test3 in Related content dropdown
And user is to click the close button of test3 Popup page

Scenario: Zoom dropdown action verification
And user is to click the Zoom dropdown action
And user is to click the Increase 
And user is to click the Decrease
And user is to click the Slider
And user is to click the Reset

Scenario: Manuals,Drawings and Glossary buttons verification
And user is to click the Manuals button
And user is to click the Drawings button
And user is to click the Glossary button 

Scenario: Search TextBox verification
And user is to click the Search Textbox
And user is to clear the Search Textbox
And user is to enter the Search Textbox
And user is to verify the related text

Scenario: All actions verification
And user is to click the FullScreen action
And user is to click the Escape key in keyboard
And user is to click the Bookmark action
And user is to close the Bookmark action
And user is to click the Search action
And user is to click the Back navigation button

Scenario: Home button & Modules button verification
And user is to click the Home button of the page
And user is to click the Edit IETM
And user is to click the Modules button of the page

Scenario: Forward & Backward navigations verification
And user is to click the Backward navigation button
And user is to click the General information module
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

