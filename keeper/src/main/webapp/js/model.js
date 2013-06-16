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
        return time.getFullYear() + "-" + padWithOneLeadingZero(time.getMonth()) + "-" + padWithOneLeadingZero(time.getDate()) + " " + padWithOneLeadingZero(time.getHours()) + ":" + padWithOneLeadingZero(time.getMinutes());
    }

    function padWithOneLeadingZero(number) {
        var paddedNumber;
        if (number < 10) {
            paddedNumber = "0".concat(number);
        } else {
            paddedNumber = number;
        }
        return paddedNumber;
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
