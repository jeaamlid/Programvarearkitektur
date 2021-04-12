package com.fallingangel.game;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AndroidInterfaceClass implements FireBaseInterface{

    FirebaseDatabase database;
    DatabaseReference myRef;

    public AndroidInterfaceClass(){
        database = FirebaseDatabase.getInstance("https://falling-angel-74f3f-default-rtdb.europe-west1.firebasedatabase.app/");
        myRef = database.getReference("message");
    }
    @Override
    public void SomeFunction() {
        System.out.println("Just some function");
    }

    @Override
    public void FirstFireBaseTest() {
        if(myRef != null){
            myRef.setValue("Bajs");
            System.out.println("Set new databasereference");
        }
        else{
            System.out.println("Databasereference was not set -> therefore could not writ to DB");
        }
    }

    @Override
    public void SetOnValueChangedListener() {

        myRef.addValueEventListener(new ValueEventListener() {

           //read from the database
            @Override
            public void onDataChange( DataSnapshot snapshot) {
                //This method is called once with the initial value and again
                // whenever data at this location is updated
              //  String value = snapshot.getValue(String.class);
                //Log.d(TAG, "Value")
            }

            @Override
            public void onCancelled( DatabaseError error) {

            }
        });
    }

    @Override
    public void SetValueInDb(String target, String value) {

    }
}
