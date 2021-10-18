package prinPatrDisEstructural.N01_ChainOfResponsability;

public interface Assistant
{
    void setNext(Assistant assistant);
    void handle(HelpDeskRequest helpDeskRequest);
}
