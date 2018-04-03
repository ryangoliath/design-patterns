package design.pattern.grasp.controller;

/*
* The Controller pattern is used to group related system events to a Non-UI single class, instead of multiple classes.
* Take this UserController as an example. Instead of writing a DeleteUserController and a CreateUserController, we define
* a single UserController and create individual methods to process the events.
*
* A Controller should not do much work. Instead, it should simply delegate the work to some other object. See it as the
* point beyond the UI which now needs to action some core activity.
* */
public class UserController
{

    public void createUser(){
        //Don't do any work, just call some method to create the user
    }

    public void deleteUser(){
        //Don't do any work, just call some method to delete the user
    }

}