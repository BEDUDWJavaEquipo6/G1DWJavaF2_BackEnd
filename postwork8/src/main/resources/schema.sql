CREATE TABLE IF NOT EXISTS `persona` (
    `id` bigint       NOT NULL AUTO_INCREMENT,
    `nombre`   varchar(100) NOT NULL,
    `apellido`   varchar(100) NOT NULL,
    `telefono`   varchar(15) NOT NULL,
    `edad`    int          NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `UN_ORDERN` (`telefono`)
    );