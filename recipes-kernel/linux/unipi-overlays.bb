inherit devicetree

SRC_URI += " \
    file://unipi_s103-overlay.dts \
    file://unipi_l203-overlay.dts \
"

COMPATIBLE_MACHINE = "^rpi$"