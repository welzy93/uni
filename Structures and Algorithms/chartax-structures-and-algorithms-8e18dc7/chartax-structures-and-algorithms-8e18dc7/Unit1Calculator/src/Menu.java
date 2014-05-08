
public class Menu
{

    String menuTitle = "Menu";

    public Menu(String menuTitle)
    {
        this.menuTitle = menuTitle;
    }

    public MenuItem[] items = new MenuItem[]{
            new MenuItem("Quit", 0),
    };

    public void addItem(MenuItem item)
    {
        MenuItem[] oldItems = items;
        MenuItem[] newItems;

        newItems = new MenuItem[(oldItems.length + 1)];
        int i = 0;

        for (MenuItem menuItem : items)
        {
            newItems[i] = new MenuItem(menuItem.displayText, menuItem.operationId);
            i++;
        }
        newItems[i] = new MenuItem(item.displayText, item.operationId);
        this.items = newItems;
    }

    public int print()
    {
        this.printMenu();
        return Input.getInteger("Please select an option: ");
    }

    public void printMenu()
    {
        System.out.println(this.menuTitle);
        System.out.println();
        int lastLen = this.menuTitle.length();
        for (MenuItem item : this.items)
        {
            String displayString = item.operationId + ": " + item.displayText;
            System.out.println(displayString);
            lastLen = displayString.length();
        }
        System.out.println(hr(lastLen));
    }

    // Horizontal rule.
    public String hr(int dashCount)
    {
        String dashString = "";
        for (int i = 0; i <= dashCount; i++)
        {
            dashString = dashString + "-";
        }

        return dashString;
    }

}
