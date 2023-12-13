package com.example.petadoption;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;

import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public Button   petfsubmit;
    @FXML
    public Button      info2;

    @FXML
    public Button      info3;
    @FXML
    public Button      info4;
    @FXML
    public TextField     dpetname1;
    @FXML
    public TextField       dpetname11;
    @FXML
    public TextField       dbreed;
    @FXML
    public TextField    dpetname;

    @FXML
    public TextField     dloc;
    @FXML
    public TextField    dnumber;
    @FXML
    public TextField     doname;


    @FXML
    public Button    backhomepage;
    @FXML
    public Text info1name;
    @FXML
    public Text info1breed;
    @FXML
    public Text info1age;
    @FXML
    public Text info1location;
    @FXML
    public Text info1medicalinfo;
    @FXML
    public Text info2name;
    @FXML
    public Text info2breed;
    @FXML
    public Text info2age;
    @FXML
    public Text info2location;
    @FXML
    public Text info2medicalinfo;
    @FXML
    public Text info3name;
    @FXML
    public Text info3breed;
    @FXML
    public Text info3age;
    @FXML
    public Text info3location;
    @FXML
    public Text info3medicalinfo;
    @FXML
    public Text info4name;
    @FXML
    public Text info4breed;
    @FXML
    public Text info4age;
    @FXML
    public Text info4location;
    @FXML
    public Text info4medicalinfo;
    @FXML
    public TextArea feedback;
    @FXML
    public TextField rating;
    public Text breed;
    @FXML
    public Text dob;
    @FXML
    public Text loc;
    @FXML
    public Text breed1;
    @FXML
    public Text oname;
    @FXML
    public Text petid;
    @FXML
    public Text ownerno;
    @FXML
    public Text category;
    @FXML
    public Label name1;
    @FXML
    public FontAwesomeIconView profile;
    @FXML
    public Button uback;
    @FXML
    public Button feed1;
    @FXML
    public Button logout;
    @FXML
    public Button donate;
    public TextField ratings;
    public TextArea ffeedback;
    public TextField pet_id;
    public Button feed2;
    public Button feed3;
    public Button feed4;
    public Button bhome;
    @FXML
    private Button home;
    @FXML
    private Button  info1;
    @FXML
    private Button   feedbackbtn;


    @FXML
    private Button gotologin;

    @FXML
    private Button Signup;
    @FXML
    private Button back;

    @FXML
    private Button feed;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField mobileNumberField;

    @FXML
    private TextField emailField;

    @FXML
    private TextArea feedbacktxt;

    @FXML
    private TextField petName;

    @FXML
    private TextField locationPlace;
    @FXML
    private TextField breedName;
    @FXML
    private Button dback;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Connection connection;

    public void gotoprofile(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) profile.getScene().getWindow();
//        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("userPage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.show();

    }

    public void backtohomefromUser(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) uback.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();


    }

    public void feedback(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) feed1.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("petfeedback.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("feedBack");
        stage.show();

    }

    public void backtomoreinfo(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();

    }

    public void gotologin(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) logout.getScene().getWindow();
//        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.show();

    }

    public void donatetohome(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) dback.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();

    }
    public void donation(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) donate.getScene().getWindow();
//        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("donateForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Donate");
        stage.show();



    }

    public void storedb(ActionEvent actionEvent) {
        String donatorid=dpetname11.getText();
        String petid =dpetname1.getText();
        String petname =dpetname.getText();
        String breed =dbreed.getText();
        String location =dloc.getText();
        String Mobile =dnumber.getText();
        String owner=doname.getText();


        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "Rahul@11";


        // JDBC code to insert data into the pet table
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO pet (donatorId, petName, breed, location) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, Integer.parseInt(donatorid));
                preparedStatement.setString(2, petname);
                preparedStatement.setString(3, breed);
                preparedStatement.setString(4, location);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void feedbackdb(ActionEvent actionEvent) {
        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "Rahul@11";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String PetId = pet_id.getText();
        String Rating=ratings.getText();
        String Feedback=ffeedback.getText();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO feedbackforpet (petId, ratings, feedback) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, Integer.parseInt(PetId));
                preparedStatement.setString(2, Rating);
                preparedStatement.setString(3, Feedback);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void feedback2(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) feed2.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("petfeedback.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("feedBack");
        stage.show();

    }
    public void feedback3(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) feed3.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("petfeedback.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("feedBack");
        stage.show();

    }
    public void feedback4(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) feed4.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("petfeedback.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("feedBack");
        stage.show();

    }

    public void bbhome(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) bhome.getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

        // Create a ScrollPane and set its content
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 800, 600);

        // Set the Scene to the Stage
        stage.setScene(scene);
        stage.setTitle("feedBack");
        stage.show();

    }


    public class Pet {
        public final int petId;
        public final String petName;

        public final String breed;
        public final String location;

        public final String DOB;

        public final String donatorId;

        public final String medicalHistory;

        public final String petCategory;



        public Pet(int petId, String petName, String breed, String location,String DOB,String donatorId,String medicalHistory,String petCategory) {
            this.petId = petId;
            this.petName = petName;
            this.breed = breed;
            this.location = location;
            this.DOB = DOB;
            this.donatorId = donatorId;
            this.medicalHistory = medicalHistory ;
            this.petCategory = petCategory;
        }
    }
    public  ObservableList<Pet> petList;

    public void reg() throws IOException {
        Stage stage = (Stage) gotologin.getScene().getWindow();
//        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.show();
    }

    public void signindata() {
        String  Username = usernameField.getText();
        String Password = passwordField.getText();
        String  Mobile = mobileNumberField.getText();
        String  Email = emailField.getText();

        // Validate if fields are not empty
        if ( Username.isEmpty() || Password.isEmpty() ||  Mobile.isEmpty() ||  Email.isEmpty()) {
            showAlert("Please fill in all fields.");
            return;
        }

        // Establish a connection
        try (Connection connection = getConnection()) {
            // Insert data into the database (you should modify this part based on your requirements)
            String insertQuery = "INSERT INTO user ( Username, Email,  Mobile,  Password) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setString(1,  Username);
                preparedStatement.setString(2, Email);
                preparedStatement.setString(3,  Mobile);
                preparedStatement.setString(4,  Password);
                preparedStatement.executeUpdate();
//                Stage stage = (Stage) Signup.getScene().getWindow();
//            stage.close();
//            Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Sign Up");
//            stage.show();
            Stage stage = (Stage) Signup.getScene().getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

            // Create a ScrollPane and set its content
            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(root);

            // Create a Scene with the ScrollPane
            Scene scene = new Scene(scrollPane, 800, 600);

            // Set the Scene to the Stage
            stage.setScene(scene);
            stage.setTitle("Home Page");
            stage.show();


//     showAlert("User data inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Error inserting user data: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection getConnection() throws SQLException {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/user";
        String dbUsername = "root";
        String dbPassword = "Rahul@11";
        return DriverManager.getConnection(url, dbUsername, dbPassword);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public void backtosignup() throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.show();
    }

public boolean validlogin(String username, String password) throws IOException{
    if ( username.isEmpty() || password.isEmpty()) {
        showAlerts("Please fill in all fields.");
        return false;
    }
    try (Connection connection = getConnections()) {
        String query = "SELECT * From user where username = ? and password = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                int count = 0;

                while (resultSet.next()){
                    count++;
                }

                if (count == 1){
                    return true;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}

    public void validateLogin() throws IOException{

        System.out.println("started");
        String username = this.usernameField.getText();
        String password = this.passwordField.getText();

        System.out.println("User: " + username);
        System.out.println("Pass: " + password);


        boolean loggedIn = validlogin(username,password);

        if (loggedIn) {
            Stage stage = (Stage) home.getScene().getWindow();
            stage.close();

            Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

            // Create a ScrollPane and set its content
            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(root);

            // Create a Scene with the ScrollPane
            Scene scene = new Scene(scrollPane, 800, 600);

            // Set the Scene to the Stage
            stage.setScene(scene);
            stage.setTitle("Home Page");
            stage.show();
        }

        else {
            showAlerts("Invaild credetinals");
        }
    }


    private Connection getConnections() throws SQLException {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/user";
        String dbUsername = "root";
        String dbPassword = "Rahul@11";
        return DriverManager.getConnection(url, dbUsername, dbPassword);
    }

    private void showAlerts(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void gotofeedback() throws IOException {
        Stage stage = (Stage) feed.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("feedbackForm.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Feedback");
        stage.show();
    }

    public void sendmail() throws IOException {
        final String username = "rahulrangesh99@gmail.com";
        final String password = "7904592480";

        // Receiver's email address
        String to =emailField.getText();

        // Mail server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a session with authentication
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);

            // Set From: header field
            message.setFrom(new InternetAddress(username));

            // Set To: header field
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("FeedBack");

            // Set the actual message
            message.setText(feedbacktxt.getText());

            // Send message
            Transport.send(message);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    private void initializeDB() {
        // Replace "your_database_url", "your_username", and "your_password" with your actual database connection details
        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "Rahul@11";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void filter() throws IOException
    {
        String petCategory = petName.getText() ;
        String breed = breedName.getText();
        String location = locationPlace.getText();

        initializeDB();
        petList = FXCollections.observableArrayList();

        applyFilters(petCategory, location, breed);

    }

    private void applyFilters(String petCategory, String location, String breed) throws IOException {
        try {
            // Clear previous data
            petList.clear();

            // Build SQL query based on filters
            String query = "SELECT * FROM pet WHERE 1=1";
            if (petCategory != null && !petCategory.isEmpty()) {
                query += " AND petCategory = ?";
            }
            if (location != null && !location.isEmpty()) {
                query += " AND location = ?";
            }
            if (breed != null && !breed.isEmpty()) {
                query += " AND breed = ?";
            }

            // Execute query
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                int parameterIndex = 1;
                if (petCategory != null && !petCategory.isEmpty()) {
                    statement.setString(parameterIndex++, petCategory);
                }
                if (location != null && !location.isEmpty()) {
                    statement.setString(parameterIndex++, location);
                }
                if (breed != null &&!breed.isEmpty()) {
                    statement.setString(parameterIndex, breed);
                }

                ResultSet resultSet = statement.executeQuery();

                // Populate the table with the results
                while (resultSet.next()) {
                    Pet pet = new Pet(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getString(6),
                            resultSet.getString(7),
                            resultSet.getString(8)
                    );


                    petList.add(pet);
                }


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        display(petList);
    }

    public void displayui(Pet p, int count) throws IOException {
        if (count == 1)
        {
            info1name.setText(p.petName);
            info1breed.setText(p.breed);
            info1location.setText(p.location);
            info1age.setText(p.DOB);
            info1medicalinfo.setText(p.medicalHistory);
            //remaining default label values
            info2name.setText("NAME");
            info2breed.setText("Breed");
            info2location.setText("Location");
            info2age.setText("Age");
            info2medicalinfo.setText("Medical info");

            info3name.setText("NAME");
            info3breed.setText("Breed");
            info3location.setText("Location");
            info3age.setText("Age");
            info3medicalinfo.setText("Medical info");

            info4name.setText("NAME");
            info4breed.setText("Breed");
            info4location.setText("Location");
            info4age.setText("Age");
            info4medicalinfo.setText("Medical info");
        }
        else if (count == 2)
        {
            info2name.setText(p.petName);
            info2breed.setText(p.breed);
            info2location.setText(p.location);
            info2age.setText(p.DOB);
            info2medicalinfo.setText(p.medicalHistory);

            //remaining default label values
            info3name.setText("NAME");
            info3breed.setText("Breed");
            info3location.setText("Location");
            info3age.setText("Age");
            info3medicalinfo.setText("Medical info");

            info4name.setText("NAME");
            info4breed.setText("Breed");
            info4location.setText("Location");
            info4age.setText("Age");
            info4medicalinfo.setText("Medical info");
        }
        else if(count == 3)
        {
            info3name.setText(p.petName);
            info3breed.setText(p.breed);
            info3location.setText(p.location);
            info3age.setText(p.DOB);
            info3medicalinfo.setText(p.medicalHistory);

            //remaining default label values
            info4name.setText("NAME");
            info4breed.setText("Breed");
            info4location.setText("Location");
            info4age.setText("Age");
            info4medicalinfo.setText("Medical info");
        }
        else if(count == 4)
        {
            info4name.setText(p.petName);
            info4breed.setText(p.breed);
            info4location.setText(p.location);
            info4age.setText(p.DOB);
            info4medicalinfo.setText(p.medicalHistory);
        }

    }

    public void displayui(int count)
    {
        //remaining default label values
        info1name.setText("NAME");
        info1breed.setText("Breed");
        info1location.setText("Location");
        info1age.setText("Age");
        info1medicalinfo.setText("Medical info");

        info2name.setText("NAME");
        info2breed.setText("Breed");
        info2location.setText("Location");
        info2age.setText("Age");
        info2medicalinfo.setText("Medical info");

        info3name.setText("NAME");
        info3breed.setText("Breed");
        info3location.setText("Location");
        info3age.setText("Age");
        info3medicalinfo.setText("Medical info");

        info4name.setText("NAME");
        info4breed.setText("Breed");
        info4location.setText("Location");
        info4age.setText("Age");
        info4medicalinfo.setText("Medical info");
    }
    public void display(ObservableList<Pet> petList) throws IOException{
        int count = 0;

        for(Pet p: petList){
            System.out.println(p.petId);
            System.out.println(p.petName);
            System.out.println(p.breed);
            System.out.println(p.location);
            System.out.println(p.donatorId);
            System.out.println(p.medicalHistory);
            System.out.println(p.DOB);
            System.out.println(p.petCategory);
            count++;
            displayui(p,count);
            //applymoreinfo(p);

        }

        if(count == 0)
        {
            displayui(count);
        }

    }

//    public void moreinfoapply(int counter) throws IOException
//    {
//        System.out.println("-------------------");
//            if(counter == 1)
//            {
//                int count1 = 0;
//
//
//
//                for(Pet p:petList) {
//                    System.out.println(p.petName);
//                    System.out.println(p.breed);
//                    System.out.println(p.DOB);
//                    System.out.println(p.petCategory);
//                    System.out.println(p.location);
//                    System.out.println(p.medicalHistory);
//
//
//                    name1.setText(p.petName);
//                    breed.setText(p.breed);
//                    dob.setText(p.DOB);
//                    category.setText(p.petCategory);
//                    loc.setText(p.location);
//                    breed1.setText(p.medicalHistory);
//                    count1++;
//                    if(count1 == 1)
//                        break;
//
//                }
//                for(Pet p:petList)
//                {
////                    name1.setText(p.petName);
//                    breed.setText(p.breed);
//                    dob.setText(p.DOB);
//                    category.setText(p. petCategory);
//                    loc.setText(p.location);
//                    breed1.setText(p.medicalHistory);
//                    count1++;
//                    if(count1 == 1)
//                        break;
//                }
//            }
//        else if(counter == 2)
//        {
//            int count1 = 0;
//
//            for(Pet p:petList)
//            {
//                name1.setText(p.petName);
//                breed.setText(p.breed);
//                dob.setText(p.DOB);
//                category.setText(p. petCategory);
//                loc.setText(p.location);
//                breed1.setText(p.medicalHistory);
//                count1++;
//                if(count1 == 2)
//                    break;
//            }
//
//        }
//            else if(counter == 3)
//            {
//                int count1 = 0;
//
//                for(Pet p:petList)
//                {
//                    name1.setText(p.petName);
//                    breed.setText(p.breed);
//                    dob.setText(p.DOB);
//                    category.setText(p. petCategory);
//                    loc.setText(p.location);
//                    breed1.setText(p.medicalHistory);
//                    count1++;
//                    if(count1 == 3)
//                        break;
//                }
//            }
//            else if(counter == 4)
//            {
//                int count1 = 0;
//
//                for(Pet p:petList)
//                {
//                    name1.setText(p.petName);
//                    breed.setText(p.breed);
//                    dob.setText(p.DOB);
//                    category.setText(p. petCategory);
//                    loc.setText(p.location);
//                    breed1.setText(p.medicalHistory);
//                    count1++;
//                    System.out.println("-------------------");
//                    System.out.println(p.petName);
//                    System.out.println("-------------------");
//                    if(count1 == 4)
//                        break;
//                }
//            }
//
//
//    }
//    public void gotomoreinfo1(ActionEvent event) throws IOException{
//        int counter = 1;
//        moreinfoapply(counter);
//        Stage stage = (Stage) info1.getScene().getWindow();
//        Parent root = FXMLLoader.load(getClass().getResource("moreinfo.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("MoreInfo");
//        stage.show();
//    }
//    public void gotomoreinfo2() throws IOException{
//        Stage stage = (Stage) info2.getScene().getWindow();
//        stage.close();
//        Parent root = FXMLLoader.load(getClass().getResource("moreinfo.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("MoreInfo");
//        stage.show();
//        int counter=2;
//        moreinfoapply(counter);
//
//
//    }
//    public void gotomoreinfo3() throws IOException{
//        Stage stage = (Stage) info3.getScene().getWindow();
//        stage.close();
//        Parent root = FXMLLoader.load(getClass().getResource("moreinfo.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("MoreInfo");
//        stage.show();
//        int counter=3;
//        moreinfoapply(counter);
//
//
//    }
//    public void gotomoreinfo4() throws IOException{
//        Stage stage = (Stage) info4.getScene().getWindow();
//        stage.close();
//        Parent root = FXMLLoader.load(getClass().getResource("moreinfo.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("MoreInfo");
//        stage.show();
//        int counter=4;
//        moreinfoapply(counter);
//
//
//    }

    public void sendfeedback() throws IOException{
        Stage stage = (Stage) feedbackbtn.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("petfeedback.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Feedback");
        stage.show();


    }

//    public void backtohomepage() throws IOException{
//        Stage stage = (Stage) backhomepage.getScene().getWindow();
//        stage.close();
//
//        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
//
//        // Create a ScrollPane and set its content
//        ScrollPane scrollPane = new ScrollPane();
//        scrollPane.setContent(root);
//
//        // Create a Scene with the ScrollPane
//        Scene scene = new Scene(scrollPane, 800, 600);
//
//        // Set the Scene to the Stage
//        stage.setScene(scene);
//        stage.setTitle("Home Page");
//        stage.show();
//
//    }
//    public void backtomoreinfo() throws IOException{
//        Stage stage = (Stage) back.getScene().getWindow();
//        Parent root = FXMLLoader.load(getClass().getResource("moreinfo.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setTitle("moreinfo");
//        stage.show();
//
//
//
//    }
//    public void applymoreinfo(Pet p) throws IOException{
//        if (flag == 1)
//        {
//            name1.setText(p.petName);
//            breed.setText(p.breed);
//            dob.setText(p.DOB);
//            category.setText(p. petCategory);
//            loc.setText(p.location);
//            breed1.setText(p.medicalHistory);
//
//
//        }
//        else if (flag == 2)
//        {
//            name1.setText(p.petName);
//            breed.setText(p.breed);
//            dob.setText(p.DOB);
//            category.setText(p. petCategory);
//            loc.setText(p.location);
//            breed1.setText(p.medicalHistory);
//        }
//        else if(flag == 3)
//        {
//            name1.setText(p.petName);
//            breed.setText(p.breed);
//            dob.setText(p.DOB);
//            category.setText(p. petCategory);
//            loc.setText(p.location);
//            breed1.setText(p.medicalHistory);
//        }
//        else if(flag == 4)
//        {
//            name1.setText(p.petName);
//            breed.setText(p.breed);
//            dob.setText(p.DOB);
//            category.setText(p. petCategory);
//            loc.setText(p.location);
//            breed1.setText(p.medicalHistory);
//        }
//
//    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialization logic if needed

    }
}
