package az.com.dth.views.mainpage;

import az.com.dth.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
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
public class MainPageView extends Composite<VerticalLayout> {

    public MainPageView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        PasswordField passwordField = new PasswordField();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        textField2.setLabel("Text field");
        textField2.setWidth("min-content");
        passwordField.setLabel("Password field");
        passwordField.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(textField2);
        layoutRow.add(passwordField);
    }
}
