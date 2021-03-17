#! /bin/sh

if ! grep -qs '/boot' /proc/mounts; then
    mount /dev/mmcblk0p1 /boot/
fi