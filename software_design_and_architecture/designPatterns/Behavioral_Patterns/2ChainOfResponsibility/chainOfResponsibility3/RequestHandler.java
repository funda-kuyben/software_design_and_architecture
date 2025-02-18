interface RequestHandler { // her departmanin(handler) ortak arayüzü
    void handleRequest(double amount);

    void setNextHandler(RequestHandler nextHandler);
}