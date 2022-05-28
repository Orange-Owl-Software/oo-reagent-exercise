# Orange Owl Reagent Exercise

**DO NOT FORK THIS REPOSITORY IN GITHUB, PLEASE CLONE IT AND FOLLOW THE
INSTRUCTIONS FOR SUBMISSION AT THE END OF THE README**

Hi, thanks for completing the Reagent take home exercise.

The purpose of this exercise is for us to get a sense of your skill level with
ClojureScript, Reagent/React, and to see your approach to solving problems.

The problem we’ve chosen is a simple unit converter, translating between metres
and feet.

## Object

Write an online conversion UI using reactive Reagent development
techniques. We’d like to see a UI like:

      Metres: [ 10        ]  <-> Feet: [ 32.80       ]

Changing the input in one text field should automatically update the value in
the other.

## Developing

We’re assuming a macOS development environment for these instructions. If you’re
on Linux, these instructions will work modulo package installation. On Windows,
you can get the gist of what’s needed from reading the `start-shadow`.

### Requirements

1. A modern JVM. OpenJDK 11+ is recommended.
2. Node.js

### Starting Shadow

We’ve provided a [Shadow CLJS](https://github.com/thheller/shadow-cljs)
configuration in the root directory. To start Shadow compilation:

      $ ./start-shadow

Then point a browser window at [http://localhost:8001]().

Open `src/oo_reagent/core.cljs` in any editor, and edit `main-ui` to return
“Hello world!”. If you see that echoed in the browser, then you’re good to go.

An nREPL service is automatically started, which can be used by Clojure editors
supporting nREPL such as Emacs CIDER.

## Submission

When you’ve completed the exercise and wish to submit your work, please do the following:

1. Make sure all your work is commited to your branch. Good commit messages and
   telling a story through the commits is a good thing.

2. Zip up the folder containing your repo and send to either your recruitment
   contact or support@orange-owl.com.

**DO NOT PUSH THE REPO UP TO GITHUB OR CREATE A PULL REQUEST AGAINST THIS REPO**
