# Environment Configuration 

## 1. Jenkins Installation
1. Install Jenkins using `java -jar jenkins.war`
2. Access Jenkins from the link `http://localhost:8080`
3. Install plugin and set admin user in UI provided

## 2. Email notification setting
1. Choose `Manage Jenkins` , then `Configure System`
2. Set `System Admin e-mail address`
3. Set `Default recipients`
4. Fill the form in `E-mail notification`
5. Save

## 3. Global Tool Configuration
1. Choose `Manage Jenkins`, then `Global Tool Configuration`
2. Find `ant`, set a new name and save
3. Save

## 4. Create testing job
1. Choose `New item`, then `Freestyle Project`
2. Set source code management as git and set github repository
3. Set `build trigger`, and choose `Github hook trigger for GITScm polling`
4. Under `build` choose `invoke ant`, choose ant version and set target
5. Under `Post-build Actions`, choose `E-mail notification` and fill in the email address of recipients
6. Save

## 5. Set Webhook in Github
1. Add Payload URL of the webhook under the UI of the github

## 6. Install Visualization Plugin
1. Choose `Manage Plugin`, then `available`
2. Type `Build History Metrics Plugin` and choose `install without restart`

# Features
## 1. Automated Testing
After environment configuration, every time you push your code to the github, Jenkins will run the test automatically

## 2. Metrics & Trends
For builds which are carried out over a period of time, the plugins of Jenkins will collect data, which are useful to understand your builds and how frequently they fail/pass over time

In our demo, by clicking `trend` you will see the chart which displays the trends of the builds over time

## 3. Email notification
In our demo, Jenkins will send out an e-mail to the specified recipients when a certain important event occurs, including:

1. Every failed build triggers a new e-mail.
2. A successful build after a failed (or unstable) build
3. An unstable build after a successful build
4. Unless configured, every unstable build triggers a new e-mail 

