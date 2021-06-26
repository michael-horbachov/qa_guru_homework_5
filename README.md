## QA GURU: homework #10

### How to run Practice Form test with Jenkins
1. Open Jenkins
2. Create a new project
3. Make a project parameterized
4. Add a *String Parameter* with the Selenoid URL
5. Choose *Git* in the Source Code Management section
6. Add the *Repository URL* with Practice Form test:  
   https://github.com/michael-horbachov/qa_guru_homework_5
7. Specify the following branch:  
   */practice-form-test
8. Add *Invoke Gradle script* build step in the Build section
9. Choose *Gradle 6.8.3* as a gradle version
10. Add the following command into *Tasks* field:  
   clean test -DselenoidUrl=${your_url_from_string_parameter}
11. Add *Allure Report* as a post-build action
12. Add the following path for *Results*:  
    build/allure-results
13. Save the configurations
14. Make a **Build with Parameters** with Selenoid URL