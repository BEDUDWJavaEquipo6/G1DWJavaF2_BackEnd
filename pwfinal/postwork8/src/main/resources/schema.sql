--Enabled during heavy testing of the webService,
--this allow to avoid droping  tables at the workbench.
--drop table `persona`;
CREATE TABLE IF NOT EXISTS `persona` (
    `id` bigint       NOT NULL AUTO_INCREMENT,
    `nombre`   varchar(100) NOT NULL,
    `apellido`   varchar(100) NOT NULL,
    `telefono`   varchar(15) NOT NULL,
    `edad`    int          NOT NULL,
    PRIMARY KEY (`id`)
    --not enabled error codes have not been detailed.
    --remove '--' to enable  code under this line
    --,
    --UNIQUE KEY `UN_ORDERN` (`telefono`)
    );