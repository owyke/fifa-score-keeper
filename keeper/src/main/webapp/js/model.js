function MatchSetup() {
    var self = this;
    self.homeTeam = ko.observable(new Team());
    self.awayTeam = ko.observable(new Team());
    self.homePlayer = ko.observable("");
    self.awayPlayer = ko.observable("");
}


function GameSession() {
    var self = this;

    self.id = ko.observable(null);
    self.name = ko.observable("");
    self.location = ko.observable("");
    self.sessionStarted = ko.observable("");
    self.sessionEnded = ko.observable("");
    self.matches = ko.observableArray([]);

    self.sessionStartedFormatted = ko.computed(function () {
        return getFullDateTime(self.sessionStarted());
    });

    self.active = ko.computed(function () {
        return self.id() !== null;
    });

    self.reset = function () {
        self.id(null);
        self.name("");
        self.location("");
        self.sessionStarted("");
        self.sessionEnded("");
        self.matches([]);
    }

    function getFullDateTime(milliTime) {
        console.log(milliTime);
        var time = new Date(milliTime);
        return time.getFullYear() + "-" + padOneZero(time.getMonth()) + "-" + padOneZero(time.getDate()) + " " + padOneZero(time.getHours()) + ":" + padOneZero(time.getMinutes());
    }

    function padOneZero(month) {
        var paddedMonth;
        if (month < 10) {
            paddedMonth = "0".concat(month);
        } else {
            paddedMonth = month;
        }
        return paddedMonth;
    }
}


function Match() {
    var self = this;
    self.id = null;
    self.homeGoals = ko.observable();
    self.awayGoals = ko.observable();
    self.homeTeam = ko.observable();
    self.awayTeam = ko.observable();
    self.homePlayer = ko.observable("");
    self.awayPlayer = ko.observable("");
    self.result = ko.computed(function () {
        return self.homeGoals() + " - " + self.awayGoals();
    });
}


function Team() {
    var self = this;
    self.id = null;
    self.name = ko.observable();
    self.rating = ko.observable();
}