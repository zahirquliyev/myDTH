package az.com.dth.views.mainpage;

import az.com.dth.data.Country;
import az.com.dth.data.DataService;
import az.com.dth.data.Gender;
import az.com.dth.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;

@PageTitle("Main Page")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PermitAll
public class MainPageView extends HorizontalLayout {

    public MainPageView() {
    	
    	TabSheet tabSheet = new TabSheet();
        
        TextField firstName = new TextField("Full name");
        DatePicker birthDate = new DatePicker("Date of Birth");
        
        ComboBox<Country> comboBox = new ComboBox<>("Nationality");
        comboBox.setItems(DataService.getCountries());
        comboBox.setItemLabelGenerator(Country::getName);
        
        ComboBox<Country> comboBoxCitizen = new ComboBox<>("Citizenship");
        comboBoxCitizen.setItems(DataService.getCountries());
        comboBoxCitizen.setItemLabelGenerator(Country::getName);
        
        ComboBox<Gender> comboBoxGender = new ComboBox<>("Gender");
        comboBoxGender.setItems(DataService.getGender());
        comboBoxGender.setItemLabelGenerator(Gender::getName);
        
        
        TextField passportNumber = new TextField("Passport Number");
        
        ComboBox<Country> comboBoxPassportIssueCountry = new ComboBox<>("Passport Issuing Country");
        comboBoxPassportIssueCountry.setItems(DataService.getCountries());
        comboBoxPassportIssueCountry.setItemLabelGenerator(Country::getName);
        
        DatePicker passportExpireDate = new DatePicker("Passport Expiry Date");
        
        TextField nationalIdNumber = new TextField("National Identification Number");
        
        Checkbox checkbox = new Checkbox();
        checkbox.setLabel("Not applicable in my country of citizenship");
        
        Button primaryButton = new Button("Save");
        primaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        FormLayout formLayout = new FormLayout();
        formLayout.add(firstName,birthDate,comboBox,comboBoxCitizen,
        		comboBoxGender, 
        		passportNumber, 
        		comboBoxPassportIssueCountry, 
        		passportExpireDate,
        		nationalIdNumber,
        		checkbox,primaryButton);
        formLayout.setResponsiveSteps(
                // Use one column by default
                new ResponsiveStep("0", 1),
                // Use two columns, if layout's width exceeds 500px
                new ResponsiveStep("500px", 2));
        // Stretch the username field over 2 columns
        //formLayout.setColspan(username, 2);
        //formLayout.setWidth("70%");
        
        
        
        
       
        tabSheet.add("Personal Details",
        		formLayout);
        tabSheet.add("Contact details",
                new Div(new Text("This is the Contact details tab content")));
        tabSheet.add("Additional Information",
                new Div(new Text("This is the Additional Information tab content")));
        add(tabSheet);
       

      
    }
}
