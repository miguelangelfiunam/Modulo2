package prinPatrDisEstructural.N01.ChainOfResponsability;

public interface Assistant
{
    void setNext(Assistant assistant);
    void handle(HelpDeskRequest helpDeskRequest);
}
