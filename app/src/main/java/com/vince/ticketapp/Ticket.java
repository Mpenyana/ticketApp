package com.vince.ticketapp;

public class Ticket {
    private int QRCode;
    private int poster;

    public Ticket(int QRCode, int poster) {
        this.QRCode = QRCode;
        this.poster = poster;
    }

    public int getQRCode() {
        return QRCode;
    }

    public void setQRCode(int QRCode) {
        this.QRCode = QRCode;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
