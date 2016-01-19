Hilly Fields Technical College
==============================
![Logo](https://raw.githubusercontent.com/neo4j-examples/sdn4-university/master/src/main/webapp/assets/images/engineering-dept.JPG)

This project is a demo application for the [Neo4j OGM 2.0](https://github.com/neo4j/neo4j-ogm)
library which provides convenient access to the [Neo4j](http://neo4j.org) graph database.

This tutorial is a fully functioning micro-service based web-application built using the following components

- [Neo4j OGM 2.0](http://neo4j.com/docs/ogm/java/2.0.0-SNAPSHOT/)
- Angular.js
- Twitter Bootstrap UI
- Ratpack

The application's domain is a fictitious educational institution - Hilly Fields Technical College - and the application
allows you to manage the College's Departments, Teaching Staff, Subjects, Students and Classes.

It leverages the power of the new Neo4j Object Graph mapping technology to provide a RESTful interface with which the web client interacts. 
The application is entirely stateless: every interaction involves a call to a Neo4j database,  demonstrating the speed of the new technology.

Configure Embedded Neo4j
-----------

Set the path to your Neo4j database in `ogm.properties`

**You should back up any data you want to keep because the application will purge any existing data first**

Download the application
------------------------

```
git clone git@github.com:neo4j-examples/neo4j-ogm-university
cd neo4j-ogm-university
bower install
```

The static resources defined in the `bower.json` file will be installed under the `$DIR/src/ratpack/public/bower_components` directory. This directory is
ignored by `git`.

Starting the application
------------------------

    cd neo4j-ogm-university
    gradlew run

Loading the initial dataset
---------------------------
The application can load a set of base data, to get you started. Please be aware that this will destroy
any existing data that may previously exist, so take a backup.

    http://localhost:5050/api/reload

This will pre-load the Neo4j database with a handful of departments, a dozen or so subjects and teachers,
and 200 students. You'll probably want to enrol them in classes...

Exploring the API:
-----------------
The JSON resources from the server can be inspected from the /api/... URLs, e.g.

    http://localhost:5050/api/departments/
    http://localhost:5050/api/subjects/
    http://localhost:5050/api/teachers/
    http://localhost:5050/api/students/
    http://localhost:5050/api/classes/

Running the Hilly Fields web application
----------------------------------------
Simply point your browser at the root URL:

    http://localhost:5050

Stopping the application server
-------------------------------
You can stop the application server at any time by pressing Ctrl-C in the console window from where you launched it.

Make it better!
---------------
If you'd like to develop this application further, you will need to install node.js if it is not already installed:

- Node.js v0.10x+
- npm (which comes bundled with Node) v2.1.0+

Visit the node.js website for details of installing node.js for your particular operating system.

Once node is installed you'll then need to grab the following npm packages:

    npm install --global bower grunt-cli
