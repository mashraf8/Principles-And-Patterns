package design_patterns.structural_patterns.composite;

public class Run {
    public static void main(String[] args)
    {
        Panel mainPanel = new Panel("MainPanel");
        Button saveButton = new Button("Save");
        Label titleLabel = new Label("Title");

        Panel subPanel = new Panel("SubPanel");
        Button cancelButton = new Button("Cancel");

        subPanel.add(cancelButton);
        mainPanel.add(titleLabel);
        mainPanel.add(saveButton);
        mainPanel.add(subPanel);

        mainPanel.render();

    }
}
