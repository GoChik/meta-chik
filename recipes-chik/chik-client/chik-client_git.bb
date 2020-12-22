SUMMARY = "Chik client"
DESCRIPTION = "Client iot application"
SECTION = "applications"

GO_CHIK_CLIENT = "github.com/gochik/client"
GO_CHIK = "github.com/gochik/chik"
GO_CHIK_MODBUS = "github.com/gochik/modbus"
GO_PUBSUB = "github.com/cskr/pubsub"
GO_UUID = "github.com/gofrs/uuid"
GO_MAPSTRUCTURE = "github.com/mitchellh/mapstructure"
GO_SUNRISE = "github.com/gochik/sunrisesunset"
GO_ZEROLOG = "github.com/rs/zerolog"
GO_SERIAL = "github.com/tarm/serial"
GO_FUNK = "github.com/thoas/go-funk"
GO_GVAL = "github.com/PaesslerAG/gval"

GO_SYNC = "github.com/golang/sync"
GO_SYS = "github.com/golang/sys"

inherit go systemd

SRC_URI = "\
    git://${GO_CHIK_CLIENT};protocol=https;name=client;destsuffix=${BPN}-${PV}/src/${GO_CHIK_CLIENT} \
    git://${GO_CHIK};protocol=https;name=chik;destsuffix=${BPN}-${PV}/src/${GO_CHIK} \
    git://${GO_CHIK_MODBUS};protocol=https;name=chikmodbus;destsuffix=${BPN}-${PV}/src/${GO_CHIK_MODBUS} \
    git://${GO_PUBSUB};protocol=https;name=pubsub;destsuffix=${BPN}-${PV}/src/${GO_PUBSUB} \
    git://${GO_UUID};protocol=https;name=uuid;destsuffix=${BPN}-${PV}/src/${GO_UUID} \
    git://${GO_MAPSTRUCTURE};protocol=https;name=mapstructure;destsuffix=${BPN}-${PV}/src/${GO_MAPSTRUCTURE} \
    git://${GO_SUNRISE};protocol=https;name=sunrise;destsuffix=${BPN}-${PV}/src/${GO_SUNRISE} \
    git://${GO_ZEROLOG};protocol=https;name=zerolog;destsuffix=${BPN}-${PV}/src/${GO_ZEROLOG} \
    git://${GO_SERIAL};protocol=https;name=serial;destsuffix=${BPN}-${PV}/src/${GO_SERIAL} \
    git://${GO_FUNK};protocol=https;name=funk;destsuffix=${BPN}-${PV}/src/${GO_FUNK} \
    git://${GO_GVAL};protocol=https;name=gval;destsuffix=${BPN}-${PV}/src/${GO_GVAL} \
    \
    git://${GO_SYNC};protocol=https;name=sync;destsuffix=${BPN}-${PV}/src/golang.org/x/sync \
    git://${GO_SYS};protocol=https;name=sys;destsuffix=${BPN}-${PV}/src/golang.org/x/sys \
    \
    file://client.conf \
    file://chik-client.service \
"
SRCREV_FORMAT = "client_chik_chikmodbus_pubsub_uuid_mapstructure_sunrise_zerolog_sync_serial_funk_sys"
SRCREV_client = "${AUTOREV}"
SRCREV_chik = "${AUTOREV}"
SRCREV_chikmodbus = "${AUTOREV}"
SRCREV_pubsub = "${AUTOREV}"
SRCREV_uuid = "${AUTOREV}"
SRCREV_mapstructure = "${AUTOREV}"
SRCREV_sunrise = "${AUTOREV}"
SRCREV_zerolog = "${AUTOREV}"
SRCREV_serial = "${AUTOREV}"
SRCREV_funk = "48b44a2becc3b796369898586ad9b762479ed28f"
SRCREV_gval = "3022fab6dfe9e0ff4a5df38d3bfe443f1d053616"
SRCREV_sync = "${AUTOREV}"
SRCREV_sys = "${AUTOREV}"

GOBUILDFLAGS += "-tags platform_unipi_neuron"
GO_INSTALL = "${GO_CHIK_CLIENT}"
GO_LINKSHARED = ""

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://src/${GO_CHIK_CLIENT}/LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "chik-client.service"

do_install_append() {
    mv ${D}${bindir}/client ${D}${bindir}/chik-client
    install -d ${D}${sysconfdir}/chik
    install -m 0644 ${WORKDIR}/client.conf ${D}${sysconfdir}/chik
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/chik-client.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += " \
    ${GOBIN_FINAL}/* \
    ${sysconfdir}/chik/client.conf \
    ${systemd_system_unitdir}/chik-client.service \
"

RDEPENDS_${PN}-dev += "bash"